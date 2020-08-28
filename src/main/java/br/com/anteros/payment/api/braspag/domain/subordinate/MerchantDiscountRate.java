package br.com.anteros.payment.api.braspag.domain.subordinate;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MerchantDiscountRate {
	
	@JsonProperty("PaymentArrangement")
	private PaymentArrangement paymentArrangement;
	
	@JsonProperty("InitialInstallmentNumber")
    private int initialInstallmentNumber;
	
	@JsonProperty("FinalInstallmentNumber")
    private int finalInstallmentNumber;
	
	@JsonProperty("Percent")
	private BigDecimal percent;

	public PaymentArrangement getPaymentArrangement() {
		return paymentArrangement;
	}

	public void setPaymentArrangement(PaymentArrangement paymentArrangement) {
		this.paymentArrangement = paymentArrangement;
	}

	public int getInitialInstallmentNumber() {
		return initialInstallmentNumber;
	}

	public void setInitialInstallmentNumber(int initialInstallmentNumber) {
		this.initialInstallmentNumber = initialInstallmentNumber;
	}

	public int getFinalInstallmentNumber() {
		return finalInstallmentNumber;
	}

	public void setFinalInstallmentNumber(int finalInstallmentNumber) {
		this.finalInstallmentNumber = finalInstallmentNumber;
	}

	public BigDecimal getPercent() {
		return percent;
	}

	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}


}
