/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.api;

import com.wallee.sdk.ApiCallback;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.ApiResponse;
import com.wallee.sdk.Pair;
import com.wallee.sdk.ProgressRequestBody;
import com.wallee.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.TransactionVoid;
import com.wallee.sdk.model.EntityQuery;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionVoidServiceApi {
	private ApiClient apiClient;

	public TransactionVoidServiceApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/* Build call for count */
	private com.squareup.okhttp.Call countCall(Long spaceId, EntityQueryFilter filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = filter;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling count(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction-void/count".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			"application/json;charset=utf-8"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"application/json;charset=utf-8"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if(progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
				@Override
				public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
					com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
					.body(new ProgressResponseBody(originalResponse.body(), progressListener))
					.build();
				}
			});
		}

		String[] localVarAuthNames = new String[] {  };
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Count
	 *
	 * Counts the number of items in the database as restricted by the given filter.
	 *
	 * @param spaceId  (required)
	 *
	 * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
	 * @return Long
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public Long count(Long spaceId, EntityQueryFilter filter) throws ApiException {
		ApiResponse<Long> resp = countWithHttpInfo(spaceId, filter);
		return resp.getData();
	}

	/**
	 * Count
	 *
	 * Counts the number of items in the database as restricted by the given filter.
	 *
	 * @param spaceId  (required)
	 *
	 * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
	 * @return ApiResponse&lt;Long&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Long> countWithHttpInfo(Long spaceId, EntityQueryFilter filter) throws ApiException {
		com.squareup.okhttp.Call call = countCall(spaceId, filter, null, null);
		Type localVarReturnType = new TypeToken<Long>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Count (asynchronously)
	 *
	 * Counts the number of items in the database as restricted by the given filter.
	 *
	 * @param spaceId  (required)
	 *
	 * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call countAsync(Long spaceId, EntityQueryFilter filter, final ApiCallback<Long> callback) throws ApiException {

		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

		if (callback != null) {
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done) {
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};

			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}

		com.squareup.okhttp.Call call = countCall(spaceId, filter, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<Long>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for read */
	private com.squareup.okhttp.Call readCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling read(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling read(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction-void/read".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			"*_/_*"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"application/json;charset=utf-8"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if(progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
				@Override
				public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
					com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
					.body(new ProgressResponseBody(originalResponse.body(), progressListener))
					.build();
				}
			});
		}

		String[] localVarAuthNames = new String[] {  };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Read
	 *
	 * Reads the entity with the given &#39;id&#39; and returns it.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction voids which should be returned. (required)
	 * @return TransactionVoid
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public TransactionVoid read(Long spaceId, Long id) throws ApiException {
		ApiResponse<TransactionVoid> resp = readWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * Read
	 *
	 * Reads the entity with the given &#39;id&#39; and returns it.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction voids which should be returned. (required)
	 * @return ApiResponse&lt;TransactionVoid&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<TransactionVoid> readWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = readCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<TransactionVoid>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Read (asynchronously)
	 *
	 * Reads the entity with the given &#39;id&#39; and returns it.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction voids which should be returned. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call readAsync(Long spaceId, Long id, final ApiCallback<TransactionVoid> callback) throws ApiException {

		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

		if (callback != null) {
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done) {
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};

			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}

		com.squareup.okhttp.Call call = readCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<TransactionVoid>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for search */
	private com.squareup.okhttp.Call searchCall(Long spaceId, EntityQuery query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = query;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling search(Async)");
		}
		
		// verify the required parameter 'query' is set
		if (query == null) {
			throw new ApiException("Missing the required parameter 'query' when calling search(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction-void/search".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			"application/json;charset=utf-8"
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"application/json;charset=utf-8"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if(progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
				@Override
				public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
					com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
					.body(new ProgressResponseBody(originalResponse.body(), progressListener))
					.build();
				}
			});
		}

		String[] localVarAuthNames = new String[] {  };
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Search
	 *
	 * Searches for the entities as specified by the given query.
	 *
	 * @param spaceId  (required)
	 *
	 * @param query The query restricts the transaction voids which are returned by the search. (required)
	 * @return List&lt;TransactionVoid&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<TransactionVoid> search(Long spaceId, EntityQuery query) throws ApiException {
		ApiResponse<List<TransactionVoid>> resp = searchWithHttpInfo(spaceId, query);
		return resp.getData();
	}

	/**
	 * Search
	 *
	 * Searches for the entities as specified by the given query.
	 *
	 * @param spaceId  (required)
	 *
	 * @param query The query restricts the transaction voids which are returned by the search. (required)
	 * @return ApiResponse&lt;List&lt;TransactionVoid&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<TransactionVoid>> searchWithHttpInfo(Long spaceId, EntityQuery query) throws ApiException {
		com.squareup.okhttp.Call call = searchCall(spaceId, query, null, null);
		Type localVarReturnType = new TypeToken<List<TransactionVoid>>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Search (asynchronously)
	 *
	 * Searches for the entities as specified by the given query.
	 *
	 * @param spaceId  (required)
	 *
	 * @param query The query restricts the transaction voids which are returned by the search. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call searchAsync(Long spaceId, EntityQuery query, final ApiCallback<List<TransactionVoid>> callback) throws ApiException {

		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

		if (callback != null) {
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done) {
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};

			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}

		com.squareup.okhttp.Call call = searchCall(spaceId, query, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<TransactionVoid>>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for voidOffline */
	private com.squareup.okhttp.Call voidOfflineCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling voidOffline(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling voidOffline(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction-void/voidOffline".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"application/json;charset=utf-8"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if(progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
				@Override
				public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
					com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
					.body(new ProgressResponseBody(originalResponse.body(), progressListener))
					.build();
				}
			});
		}

		String[] localVarAuthNames = new String[] {  };
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * voidOffline
	 *
	 * This operation voids the transaction offline. The void is not forwarded to the processor. This implies the processor does not do anything. This method is only here to fix manually the transaction state.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be voided. (required)
	 * @return TransactionVoid
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public TransactionVoid voidOffline(Long spaceId, Long id) throws ApiException {
		ApiResponse<TransactionVoid> resp = voidOfflineWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * voidOffline
	 *
	 * This operation voids the transaction offline. The void is not forwarded to the processor. This implies the processor does not do anything. This method is only here to fix manually the transaction state.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be voided. (required)
	 * @return ApiResponse&lt;TransactionVoid&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<TransactionVoid> voidOfflineWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = voidOfflineCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<TransactionVoid>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * voidOffline (asynchronously)
	 *
	 * This operation voids the transaction offline. The void is not forwarded to the processor. This implies the processor does not do anything. This method is only here to fix manually the transaction state.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be voided. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call voidOfflineAsync(Long spaceId, Long id, final ApiCallback<TransactionVoid> callback) throws ApiException {

		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

		if (callback != null) {
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done) {
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};

			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}

		com.squareup.okhttp.Call call = voidOfflineCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<TransactionVoid>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/* Build call for voidOnline */
	private com.squareup.okhttp.Call voidOnlineCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;
		
		// verify the required parameter 'spaceId' is set
		if (spaceId == null) {
			throw new ApiException("Missing the required parameter 'spaceId' when calling voidOnline(Async)");
		}
		
		// verify the required parameter 'id' is set
		if (id == null) {
			throw new ApiException("Missing the required parameter 'id' when calling voidOnline(Async)");
		}
		

		// create path and map variables
		String localVarPath = "/transaction-void/voidOnline".replaceAll("\\{format\\}","json");

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		localVarQueryParams.addAll(apiClient.parameterToPairs("", "spaceId", spaceId));

		localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		final String[] localVarAccepts = {
			
		};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {
			"application/json;charset=utf-8"
		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if(progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
				@Override
				public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
					com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
					.body(new ProgressResponseBody(originalResponse.body(), progressListener))
					.build();
				}
			});
		}

		String[] localVarAuthNames = new String[] {  };
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * voidOnline
	 *
	 * This operation voids the transaction online. The void is forwarded to the processor. This implies that the processor may take some actions based on the void.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be voided. (required)
	 * @return TransactionVoid
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public TransactionVoid voidOnline(Long spaceId, Long id) throws ApiException {
		ApiResponse<TransactionVoid> resp = voidOnlineWithHttpInfo(spaceId, id);
		return resp.getData();
	}

	/**
	 * voidOnline
	 *
	 * This operation voids the transaction online. The void is forwarded to the processor. This implies that the processor may take some actions based on the void.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be voided. (required)
	 * @return ApiResponse&lt;TransactionVoid&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<TransactionVoid> voidOnlineWithHttpInfo(Long spaceId, Long id) throws ApiException {
		com.squareup.okhttp.Call call = voidOnlineCall(spaceId, id, null, null);
		Type localVarReturnType = new TypeToken<TransactionVoid>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * voidOnline (asynchronously)
	 *
	 * This operation voids the transaction online. The void is forwarded to the processor. This implies that the processor may take some actions based on the void.
	 *
	 * @param spaceId  (required)
	 *
	 * @param id The id of the transaction which should be voided. (required)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call voidOnlineAsync(Long spaceId, Long id, final ApiCallback<TransactionVoid> callback) throws ApiException {

		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

		if (callback != null) {
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done) {
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};

			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}

		com.squareup.okhttp.Call call = voidOnlineCall(spaceId, id, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<TransactionVoid>(){}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

}
