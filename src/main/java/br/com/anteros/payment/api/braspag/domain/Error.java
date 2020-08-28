package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error {

	@JsonProperty("Code")
	private int Code;

	@JsonProperty("Message")
	private String Message;

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}
}
