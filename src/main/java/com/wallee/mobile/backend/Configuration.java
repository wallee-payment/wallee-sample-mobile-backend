package com.wallee.mobile.backend;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;

import javax.net.ssl.HttpsURLConnection;

import com.google.appengine.api.utils.SystemProperty;
import com.google.common.io.CharStreams;

/**
 * This class provides the configuration to be used for accessing the remote web service.
 * 
 * @author Thomas Hunziker
 *
 */
public final class Configuration {

	/**
	 * Holds the instance of the configuration to use.
	 */
	public final static Configuration INSTANCE = createInstance();

	private static final String USER_ID_META_DATA_KEY = "WalleeApplicationUserId";
	private static final String APP_KEY_META_DATA_KEY = "WalleeApplicationUserKey";
	private static final String PROPERY_CLASS_PATH = "config/config.properties";

	private static Configuration createInstance() {
		// When we are in the local environment we use the local configuration
		// otherwise we use the meta store.
		if (SystemProperty.environment.value() == null) {
			return createInstanceFromLocalConifg();
		} else {
			return createInstanceFromAppEngineMetaDataStore();
		}
	}

	private static Configuration createInstanceFromLocalConifg() {
		Properties config = new Properties();
		try {
			config.load(Configuration.class.getClassLoader().getResourceAsStream(PROPERY_CLASS_PATH));
			String userId = config.getProperty(USER_ID_META_DATA_KEY);
			if (userId == null || userId.isEmpty()) {
				throw new IllegalArgumentException(
						"The properties file does not contain the key: " + USER_ID_META_DATA_KEY);
			}
			String userKey = config.getProperty(APP_KEY_META_DATA_KEY);
			if (userKey == null || userKey.isEmpty()) {
				throw new IllegalArgumentException(
						"The properties file does not contain the key: " + APP_KEY_META_DATA_KEY);
			}
			return new Configuration(Long.parseLong(userId), userKey);
		} catch (IOException e) {
			throw new RuntimeException(
					"Unable to load the properties file from the classpath: " + PROPERY_CLASS_PATH + " Message: " + e,
					e);
		}
	}

	private static Configuration createInstanceFromAppEngineMetaDataStore() {
		String userId = readAppEngineMetaKey(USER_ID_META_DATA_KEY);
		if (userId == null || userId.isEmpty()) {
			throw new IllegalArgumentException(
					"he Google App Engine meta store does not contain the key: " + USER_ID_META_DATA_KEY);
		}
		String userKey = readAppEngineMetaKey(APP_KEY_META_DATA_KEY);
		if (userKey == null || userKey.isEmpty()) {
			throw new IllegalArgumentException(
					"The Google App Engine meta store does not contain the key: " + APP_KEY_META_DATA_KEY);
		}
		return new Configuration(Long.parseLong(userId), userKey);
	}

	private static String readAppEngineMetaKey(String keyName) {
		try {
			URL url = new URL("http://metadata.google.internal/computeMetadata/v1/project/attributes/" + keyName);
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.setRequestProperty("Metadata-Flavor", "Google");
			try (InputStream input = connection.getInputStream()) {
				return CharStreams.toString(new InputStreamReader(input, "UTF-8"));
			}
		} catch (IOException e) {
			throw new RuntimeException("Unable to fetch meta key: " + keyName + " Message: " + e, e);
		}
	}

	private final long applicationUserId;
	private final String applicationUserKey;

	private Configuration(long userId, String apiKey) {
		if (apiKey == null || apiKey.isEmpty()) {
			throw new IllegalArgumentException("The provided API key is not valid.");
		}
		this.applicationUserId = userId;
		this.applicationUserKey = apiKey;
	}

	public long getApplicationUserId() {
		return this.applicationUserId;
	}

	public String getApplicationUserKey() {
		return this.applicationUserKey;
	}

}
