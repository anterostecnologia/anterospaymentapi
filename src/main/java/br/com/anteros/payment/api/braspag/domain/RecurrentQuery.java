package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecurrentQuery {
	
	@JsonProperty("Customer")
	private Customer customer;
	
	@JsonProperty("RecurrentPayment")
    private RecurrentPaymentQueryModel recurrentPayment;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public RecurrentPaymentQueryModel getRecurrentPayment() {
		return recurrentPayment;
	}

	public void setRecurrentPayment(RecurrentPaymentQueryModel recurrentPayment) {
		this.recurrentPayment = recurrentPayment;
	}

}
