package br.com.anteros.payment.api.braspag.domain.subordinate;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Notification {
	
	@JsonProperty("Url")
	private String url;

	@JsonProperty("Headers")
	private List<HeaderValue> headers;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<HeaderValue> getHeaders() {
		return headers;
	}

	public void setHeaders(List<HeaderValue> headers) {
		this.headers = headers;
	}

}
