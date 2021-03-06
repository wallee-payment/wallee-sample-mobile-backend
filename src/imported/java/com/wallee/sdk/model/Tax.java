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
import java.math.BigDecimal;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class Tax {
	@SerializedName("rate")
	private BigDecimal rate = null;

	@SerializedName("title")
	private String title = null;

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getRate() {
		return rate;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getTitle() {
		return title;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax tax = (Tax) o;
		return Objects.equals(this.rate, tax.rate) &&
				Objects.equals(this.title, tax.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(rate, title);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax {\n");
		
		sb.append("		rate: ").append(toIndentedString(rate)).append("\n");
		sb.append("		title: ").append(toIndentedString(title)).append("\n");
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

