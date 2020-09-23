package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SplitPayment {
	
	@JsonProperty("SubordinateMerchantId")
	private String subordinateMerchantId;
	
	@JsonProperty("Amount")
	private long amount;
	
	@JsonProperty("Fares")
	private Fares fares;

	public String getSubordinateMerchantId() {
		return subordinateMerchantId;
	}

	public void setSubordinateMerchantId(String subordinateMerchantId) {
		this.subordinateMerchantId = subordinateMerchantId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Fares getFares() {
		return fares;
	}

	public void setFares(Fares fares) {
		this.fares = fares;
	}

}
