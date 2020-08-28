package br.com.anteros.payment.api.braspag.domain.subordinate;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Notification {
	
	@JsonProperty("Url")
	private String url;

	@JsonProperty("Headers")
	private Map<String,String> headers;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
}
