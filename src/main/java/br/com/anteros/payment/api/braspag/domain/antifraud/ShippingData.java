package br.com.anteros.payment.api.braspag.domain.antifraud;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.anteros.payment.api.braspag.domain.enums.ShippingMethodType;

public class ShippingData {
	
	@JsonProperty("Addressee")
	private String addressee ;
	
	@JsonProperty("Phone")
    private String phone ;
	
	@JsonProperty("Method")
    private ShippingMethodType method ;

	public String getAddressee() {
		return addressee;
	}

	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ShippingMethodType getMethod() {
		return method;
	}

	public void setMethod(ShippingMethodType method) {
		this.method = method;
	}

}
