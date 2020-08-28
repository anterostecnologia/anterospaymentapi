package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalAuthentication {

	@JsonProperty("Cavv")
	private String cavv;
	
	@JsonProperty("Xi")
	private String xi;
	
	@JsonProperty("Eci")
	private String eci;

	public String getCavv() {
		return cavv;
	}

	public void setCavv(String cavv) {
		this.cavv = cavv;
	}

	public String getXi() {
		return xi;
	}

	public void setXi(String xi) {
		this.xi = xi;
	}

	public String getEci() {
		return eci;
	}

	public void setEci(String eci) {
		this.eci = eci;
	}
}
