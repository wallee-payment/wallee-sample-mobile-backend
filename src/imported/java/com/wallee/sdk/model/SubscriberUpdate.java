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
import com.wallee.sdk.model.AddressCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A subscriber represents everyone who is subscribed to a product.
 */
@io.swagger.annotations.ApiModel(description = "A subscriber represents everyone who is subscribed to a product.")
public class SubscriberUpdate {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("version")
	private Long version = null;

	@SerializedName("additionalAllowedPaymentMethodConfigurations")
	private List<Long> additionalAllowedPaymentMethodConfigurations = new ArrayList<Long>();

	@SerializedName("billingAddress")
	private AddressCreate billingAddress = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("disallowedPaymentMethodConfigurations")
	private List<Long> disallowedPaymentMethodConfigurations = new ArrayList<Long>();

	@SerializedName("emailAddress")
	private String emailAddress = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("reference")
	private String reference = null;

	@SerializedName("shippingAddress")
	private AddressCreate shippingAddress = null;

	public SubscriberUpdate id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SubscriberUpdate version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public SubscriberUpdate additionalAllowedPaymentMethodConfigurations(List<Long> additionalAllowedPaymentMethodConfigurations) {
		this.additionalAllowedPaymentMethodConfigurations = additionalAllowedPaymentMethodConfigurations;
		return this;
	}

	public SubscriberUpdate addAdditionalAllowedPaymentMethodConfigurationsItem(Long additionalAllowedPaymentMethodConfigurationsItem) {
		this.additionalAllowedPaymentMethodConfigurations.add(additionalAllowedPaymentMethodConfigurationsItem);
		return this;
	}

	/**
	 * Those payment methods which are allowed additionally will be available even when the product does not allow those methods.
	 *
	 * @return Those payment methods which are allowed additionally will be available even when the product does not allow those methods.
	 */
	@ApiModelProperty(example = "null", value = "Those payment methods which are allowed additionally will be available even when the product does not allow those methods.")
	public List<Long> getAdditionalAllowedPaymentMethodConfigurations() {
		return additionalAllowedPaymentMethodConfigurations;
	}

	public void setAdditionalAllowedPaymentMethodConfigurations(List<Long> additionalAllowedPaymentMethodConfigurations) {
		this.additionalAllowedPaymentMethodConfigurations = additionalAllowedPaymentMethodConfigurations;
	}

	public SubscriberUpdate billingAddress(AddressCreate billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public AddressCreate getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(AddressCreate billingAddress) {
		this.billingAddress = billingAddress;
	}

	public SubscriberUpdate description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The subscriber description can be used to add a description to the subscriber. This is used in the back office to identify the subscriber.
	 *
	 * @return The subscriber description can be used to add a description to the subscriber. This is used in the back office to identify the subscriber.
	 */
	@ApiModelProperty(example = "null", value = "The subscriber description can be used to add a description to the subscriber. This is used in the back office to identify the subscriber.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SubscriberUpdate disallowedPaymentMethodConfigurations(List<Long> disallowedPaymentMethodConfigurations) {
		this.disallowedPaymentMethodConfigurations = disallowedPaymentMethodConfigurations;
		return this;
	}

	public SubscriberUpdate addDisallowedPaymentMethodConfigurationsItem(Long disallowedPaymentMethodConfigurationsItem) {
		this.disallowedPaymentMethodConfigurations.add(disallowedPaymentMethodConfigurationsItem);
		return this;
	}

	/**
	 * Those payment methods which are disallowed will not be available to the subscriber even if the product allows those methods.
	 *
	 * @return Those payment methods which are disallowed will not be available to the subscriber even if the product allows those methods.
	 */
	@ApiModelProperty(example = "null", value = "Those payment methods which are disallowed will not be available to the subscriber even if the product allows those methods.")
	public List<Long> getDisallowedPaymentMethodConfigurations() {
		return disallowedPaymentMethodConfigurations;
	}

	public void setDisallowedPaymentMethodConfigurations(List<Long> disallowedPaymentMethodConfigurations) {
		this.disallowedPaymentMethodConfigurations = disallowedPaymentMethodConfigurations;
	}

	public SubscriberUpdate emailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

	/**
	 * The email address is used to communicate with the subscriber. There can be only one subscriber per space with the same email address.
	 *
	 * @return The email address is used to communicate with the subscriber. There can be only one subscriber per space with the same email address.
	 */
	@ApiModelProperty(example = "null", value = "The email address is used to communicate with the subscriber. There can be only one subscriber per space with the same email address.")
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public SubscriberUpdate language(String language) {
		this.language = language;
		return this;
	}

	/**
	 * The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices).
	 *
	 * @return The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices).
	 */
	@ApiModelProperty(example = "null", value = "The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices).")
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public SubscriberUpdate reference(String reference) {
		this.reference = reference;
		return this;
	}

	/**
	 * The subscriber reference identifies the subscriber in administrative interfaces (e.g. customer id).
	 *
	 * @return The subscriber reference identifies the subscriber in administrative interfaces (e.g. customer id).
	 */
	@ApiModelProperty(example = "null", value = "The subscriber reference identifies the subscriber in administrative interfaces (e.g. customer id).")
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public SubscriberUpdate shippingAddress(AddressCreate shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public AddressCreate getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(AddressCreate shippingAddress) {
		this.shippingAddress = shippingAddress;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubscriberUpdate subscriberUpdate = (SubscriberUpdate) o;
		return Objects.equals(this.id, subscriberUpdate.id) &&
				Objects.equals(this.version, subscriberUpdate.version) &&
				Objects.equals(this.additionalAllowedPaymentMethodConfigurations, subscriberUpdate.additionalAllowedPaymentMethodConfigurations) &&
				Objects.equals(this.billingAddress, subscriberUpdate.billingAddress) &&
				Objects.equals(this.description, subscriberUpdate.description) &&
				Objects.equals(this.disallowedPaymentMethodConfigurations, subscriberUpdate.disallowedPaymentMethodConfigurations) &&
				Objects.equals(this.emailAddress, subscriberUpdate.emailAddress) &&
				Objects.equals(this.language, subscriberUpdate.language) &&
				Objects.equals(this.reference, subscriberUpdate.reference) &&
				Objects.equals(this.shippingAddress, subscriberUpdate.shippingAddress);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, version, additionalAllowedPaymentMethodConfigurations, billingAddress, description, disallowedPaymentMethodConfigurations, emailAddress, language, reference, shippingAddress);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriberUpdate {\n");
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
		sb.append("		additionalAllowedPaymentMethodConfigurations: ").append(toIndentedString(additionalAllowedPaymentMethodConfigurations)).append("\n");
		sb.append("		billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		disallowedPaymentMethodConfigurations: ").append(toIndentedString(disallowedPaymentMethodConfigurations)).append("\n");
		sb.append("		emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		reference: ").append(toIndentedString(reference)).append("\n");
		sb.append("		shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
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

