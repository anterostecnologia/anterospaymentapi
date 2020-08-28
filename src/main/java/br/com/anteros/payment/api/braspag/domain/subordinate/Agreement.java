package br.com.anteros.payment.api.braspag.domain.subordinate;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Agreement {
	
	@JsonProperty("Fee")
	private int fee;
	
	@JsonProperty("MdrPercentage")
	private int mdrPercentage;
	
	@JsonProperty("MerchantDiscountRates")
	private List<MerchantDiscountRate> merchantDiscountRates;

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public List<MerchantDiscountRate> getMerchantDiscountRates() {
		return merchantDiscountRates;
	}

	public void setMerchantDiscountRates(List<MerchantDiscountRate> merchantDiscountRates) {
		this.merchantDiscountRates = merchantDiscountRates;
	}

	public int getMdrPercentage() {
		return mdrPercentage;
	}

	public void setMdrPercentage(int mdrPercentage) {
		this.mdrPercentage = mdrPercentage;
	}

}
