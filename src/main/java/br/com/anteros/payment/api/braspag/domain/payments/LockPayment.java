package br.com.anteros.payment.api.braspag.domain.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LockPayment {

	@JsonProperty("SubordinateMerchantId")
	private String subordinateMerchantId;

	@JsonProperty("Locked")
	private boolean locked;

	public String getSubordinateMerchantId() {
		return subordinateMerchantId;
	}

	public void setSubordinateMerchantId(String subordinateMerchantId) {
		this.subordinateMerchantId = subordinateMerchantId;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

}
