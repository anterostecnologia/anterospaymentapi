package br.com.anteros.payment.api.braspag.domain.antifraud;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.anteros.payment.api.braspag.domain.enums.PassengerRatingType;

public class PassengerData {
	
	@JsonProperty("Name")
	private String name ;

	@JsonProperty("Identity")
    private String identity ;
	
	@JsonProperty("Status")
    private String status ;
	
	@JsonProperty("Rating")
    private PassengerRatingType rating ;
	
	@JsonProperty("Email")
    private String email ;
	
	@JsonProperty("Phone")
    private String phone ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public PassengerRatingType getRating() {
		return rating;
	}

	public void setRating(PassengerRatingType rating) {
		this.rating = rating;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
