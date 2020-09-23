package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fares {
	
	@JsonProperty("Fee")
	private Long fee;
	
	@JsonProperty("Mdr")
	private Long mdr;

	public Long getFee() {
		return fee;
	}

	public void setFee(Long fee) {
		this.fee = fee;
	}

	public Long getMdr() {
		return mdr;
	}

	public void setMdr(Long mdr) {
		this.mdr = mdr;
	}

}
