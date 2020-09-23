package br.com.anteros.payment.api.braspag.domain.subordinate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeaderValue {
	
	@JsonProperty("Key")
	private String key;
	
	@JsonProperty("Value")
	private String value;
	
	public HeaderValue(){
		
	}

	public HeaderValue(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
