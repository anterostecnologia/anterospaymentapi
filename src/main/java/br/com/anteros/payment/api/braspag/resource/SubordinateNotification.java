package br.com.anteros.payment.api.braspag.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.anteros.payment.api.braspag.domain.subordinate.Analysis;

public class SubordinateNotification {
	
	
	@JsonProperty("MerchantId")
	private String MerchantId;
	
	@JsonProperty("Analysis")
	private Analysis Analysis;

	public String getMerchantId() {
		return MerchantId;
	}

	public void setMerchantId(String merchantId) {
		MerchantId = merchantId;
	}

	public Analysis getAnalysis() {
		return Analysis;
	}

	public void setAnalysis(Analysis analysis) {
		Analysis = analysis;
	}
}
