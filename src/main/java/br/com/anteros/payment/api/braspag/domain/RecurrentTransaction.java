package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecurrentTransaction {

	@JsonProperty("PaymentNumber")
	private Long paymentNumber;
	
	@JsonProperty("RecurrentPaymentId")
    private String recurrentPaymentId;
	
	@JsonProperty("TransactionId")
    private String rransactionId;
	
	@JsonProperty("TryNumber")
    private Integer tryNumber;

	public Long getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(Long paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

	public String getRecurrentPaymentId() {
		return recurrentPaymentId;
	}

	public void setRecurrentPaymentId(String recurrentPaymentId) {
		this.recurrentPaymentId = recurrentPaymentId;
	}

	public String getRransactionId() {
		return rransactionId;
	}

	public void setRransactionId(String rransactionId) {
		this.rransactionId = rransactionId;
	}

	public Integer getTryNumber() {
		return tryNumber;
	}

	public void setTryNumber(Integer tryNumber) {
		this.tryNumber = tryNumber;
	}
}
