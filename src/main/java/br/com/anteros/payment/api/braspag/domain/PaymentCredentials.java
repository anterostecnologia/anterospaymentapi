package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentCredentials {
	
	@JsonProperty("code")
	private String Code;
	
	@JsonProperty("key")
	private String Key;
	
	@JsonProperty("password")
	private String Password;
	
	@JsonProperty("signature")
	private String Signature;
	
	@JsonProperty("username")
	private String Username;

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getKey() {
		return Key;
	}

	public void setKey(String key) {
		Key = key;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getSignature() {
		return Signature;
	}

	public void setSignature(String signature) {
		Signature = signature;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}
}
