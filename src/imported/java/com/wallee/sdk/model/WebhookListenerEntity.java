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


package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class WebhookListenerEntity {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("name")
	private Map<String, String> name = new HashMap<String, String>();

	@SerializedName("technicalName")
	private String technicalName = null;

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	@ApiModelProperty(example = "null", value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
	public Long getId() {
		return id;
	}

	public WebhookListenerEntity name(Map<String, String> name) {
		this.name = name;
		return this;
	}

	public WebhookListenerEntity putNameItem(String key, String nameItem) {
		this.name.put(key, nameItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Map<String, String> getName() {
		return name;
	}

	public void setName(Map<String, String> name) {
		this.name = name;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getTechnicalName() {
		return technicalName;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WebhookListenerEntity webhookListenerEntity = (WebhookListenerEntity) o;
		return Objects.equals(this.id, webhookListenerEntity.id) &&
				Objects.equals(this.name, webhookListenerEntity.name) &&
				Objects.equals(this.technicalName, webhookListenerEntity.technicalName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, technicalName);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WebhookListenerEntity {\n");
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		technicalName: ").append(toIndentedString(technicalName)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n		");
	}

}

