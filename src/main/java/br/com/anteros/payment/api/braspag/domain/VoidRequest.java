package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VoidRequest {
	
	@JsonProperty("Amount")
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
