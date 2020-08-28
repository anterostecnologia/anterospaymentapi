package br.com.anteros.payment.api.braspag.domain.antifraud;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TravelData {
	
	@JsonProperty("Route")
	private String route ;
	
	@JsonProperty("DepartureTime")
    private Date departureTime ;
	
	@JsonProperty("JourneyType")
    private String journeyType ;
	
	@JsonProperty("Legs")
    private List<TravelLegData> legs ;

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public String getJourneyType() {
		return journeyType;
	}

	public void setJourneyType(String journeyType) {
		this.journeyType = journeyType;
	}

	public List<TravelLegData> getLegs() {
		return legs;
	}

	public void setLegs(List<TravelLegData> legs) {
		this.legs = legs;
	}

}
