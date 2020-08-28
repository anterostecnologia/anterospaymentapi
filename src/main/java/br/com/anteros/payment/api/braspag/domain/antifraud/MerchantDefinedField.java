package br.com.anteros.payment.api.braspag.domain.antifraud;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MerchantDefinedField {
	
	@JsonProperty("Id")
	private int id ;
	
	@JsonProperty("Value")
    private String value ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
