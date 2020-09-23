package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sale {
	@JsonProperty("MerchantId")
	private String merchantId;
	
	@JsonProperty("MerchantKey")
	private String merchantKey;	
	
	@JsonProperty("MerchantOrderId")
	private String merchantOrderId;
	
	@JsonProperty("Customer")
	private Customer customer;
	
	@JsonProperty("Payment")
	private Payment payment;
	
		
	public Sale() {
		
	}

	private Sale(String merchantOrderId, Customer customer, Payment payment) {
		super();
		this.merchantOrderId = merchantOrderId;
		this.customer = customer;
		this.payment = payment;
	}

	public Sale(String merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Sale setCustomer(Customer customer) {
		this.customer = customer;
		return this;
	}

	public String getMerchantOrderId() {
		return merchantOrderId;
	}

	public Sale setMerchantOrderId(String merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
		return this;
	}

	public Payment getPayment() {
		return payment;
	}

	public Sale setPayment(Payment payment) {
		this.payment = payment;
		return this;
	}

	public static Sale of(String merchantOrderId, Customer customer, Payment payment) {
		return new Sale(merchantOrderId,customer,payment);
	}

	@Override
	public String toString() {
		return "Sale [merchantOrderId=" + merchantOrderId + ", customer=" + customer + ", payment=" + payment + "]";
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantKey() {
		return merchantKey;
	}

	public void setMerchantKey(String merchantKey) {
		this.merchantKey = merchantKey;
	}
	
	
}