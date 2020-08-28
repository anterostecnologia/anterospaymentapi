package br.com.anteros.payment.api.braspag.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CaptureResponse {

	@JsonProperty("Status")
	private int status;
	
	@JsonProperty("ReasonCode")
	private int reasonCode;
	
	@JsonProperty("ReasonMessage")
	private String reasonMessage;
	
	@JsonProperty("ProviderReturnCode")
    private String providerReturnCode;
	
	@JsonProperty("ProviderReturnMessage")
    private String providerReturnMessage;

	@JsonProperty("Links")
	private List<Link> links;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(int reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReasonMessage() {
		return reasonMessage;
	}

	public void setReasonMessage(String reasonMessage) {
		this.reasonMessage = reasonMessage;
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

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	} 
}
