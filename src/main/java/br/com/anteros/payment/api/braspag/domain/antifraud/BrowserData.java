package br.com.anteros.payment.api.braspag.domain.antifraud;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrowserData {

	@JsonProperty("HostName")
	private String hostName;
	
	@JsonProperty("CookiesAccepted")
    private boolean cookiesAccepted;
	
	@JsonProperty("Email")	
    private String email;
	
	@JsonProperty("Type")
    private String type;
	
	@JsonProperty("IpAddress")
    private String ipAddress;

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public boolean isCookiesAccepted() {
		return cookiesAccepted;
	}

	public void setCookiesAccepted(boolean cookiesAccepted) {
		this.cookiesAccepted = cookiesAccepted;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
}
