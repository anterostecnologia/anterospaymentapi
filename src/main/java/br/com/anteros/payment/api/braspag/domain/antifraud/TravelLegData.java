package br.com.anteros.payment.api.braspag.domain.antifraud;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TravelLegData {
	
	@JsonProperty("Destination")
	private String destination ;
	
	@JsonProperty("Origin")
    private String origin ;

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
    
}
