package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CaptureRequest {

	@JsonProperty("Amount")
	private int amount;
	
	@JsonProperty("ServiceTaxAmount")
	private int serviceTaxAmount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getServiceTaxAmount() {
		return serviceTaxAmount;
	}

	public void setServiceTaxAmount(int serviceTaxAmount) {
		this.serviceTaxAmount = serviceTaxAmount;
	}
}
