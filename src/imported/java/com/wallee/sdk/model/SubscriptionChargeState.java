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


/**
 * 
 */
public enum SubscriptionChargeState {
	
	@SerializedName("SCHEDULED")
	SCHEDULED("SCHEDULED"),
	
	@SerializedName("DISCARDED")
	DISCARDED("DISCARDED"),
	
	@SerializedName("PROCESSING")
	PROCESSING("PROCESSING"),
	
	@SerializedName("SUCCESSFUL")
	SUCCESSFUL("SUCCESSFUL"),
	
	@SerializedName("FAILED")
	FAILED("FAILED");

	private String value;

	SubscriptionChargeState(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

