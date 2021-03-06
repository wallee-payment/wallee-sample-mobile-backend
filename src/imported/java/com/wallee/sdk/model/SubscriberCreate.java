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
import com.wallee.sdk.model.AbstractSubscriberUpdate;
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * A subscriber represents everyone who is subscribed to a product.
 */
@io.swagger.annotations.ApiModel(description = "A subscriber represents everyone who is subscribed to a product.")
public class SubscriberCreate extends AbstractSubscriberUpdate {
	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("externalId")
	private String externalId = null;

	public SubscriberCreate state(CreationEntityState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public CreationEntityState getState() {
		return state;
	}

	public void setState(CreationEntityState state) {
		this.state = state;
	}

	public SubscriberCreate externalId(String externalId) {
		this.externalId = externalId;
		return this;
	}

	/**
	 * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 *
	 * @return The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubscriberCreate subscriberCreate = (SubscriberCreate) o;
		return Objects.equals(this.state, subscriberCreate.state) &&
				Objects.equals(this.externalId, subscriberCreate.externalId) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(state, externalId, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriberCreate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
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

