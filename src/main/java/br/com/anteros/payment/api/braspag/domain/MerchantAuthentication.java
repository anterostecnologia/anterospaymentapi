package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MerchantAuthentication {

	@JsonProperty("MerchantId")
	private String merchantId;
	
	@JsonProperty("MerchantKey")
	private String merchantKey;
	
	public MerchantAuthentication() {
		
	}

	private MerchantAuthentication(String merchantId, String merchantKey) {
		super();
		this.merchantId = merchantId;
		this.merchantKey = merchantKey;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantKey() {
		return merchantKey;
	}

	public void setMerchantKey(String merchantKey) {
		this.merchantKey = merchantKey;
	}

	public static MerchantAuthentication of(String merchantId, String merchantKey) {
		return new MerchantAuthentication(merchantId, merchantKey);
	}
}
