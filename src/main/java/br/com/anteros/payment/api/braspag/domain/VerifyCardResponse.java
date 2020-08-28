package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VerifyCardResponse {

	@JsonProperty("Status")
	private int status;

	@JsonProperty("ProviderReturnCode")
	private String providerReturnCode;

	@JsonProperty("ProviderReturnMessage")
	private String providerReturnMessage;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getProviderReturnCode() {
		return providerReturnCode;
	}

	public void setProviderReturnCode(String providerReturnCode) {
		this.providerReturnCode = providerReturnCode;
	}

	public String getProviderReturnMessage() {
		return providerReturnMessage;
	}

	public void setProviderReturnMessage(String providerReturnMessage) {
		this.providerReturnMessage = providerReturnMessage;
	}
}
