package br.com.anteros.payment.api.braspag.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.anteros.payment.api.braspag.domain.enums.WalletType;

public class Wallet {

	@JsonProperty("Type")
	private WalletType type;

	@JsonProperty("WalletKey")
	private String walletKey;

	@JsonProperty("Cavv")
	private String cavv;

	@JsonProperty("Eci")
	private short eci;

	@JsonProperty("AdditionalData")
	private Map<String, String> additionalData;

	public WalletType getType() {
		return type;
	}

	public void setType(WalletType type) {
		this.type = type;
	}

	public String getWalletKey() {
		return walletKey;
	}

	public void setWalletKey(String walletKey) {
		this.walletKey = walletKey;
	}

	public String getCavv() {
		return cavv;
	}

	public void setCavv(String cavv) {
		this.cavv = cavv;
	}

	public short getEci() {
		return eci;
	}

	public void setEci(short eci) {
		this.eci = eci;
	}

	public Map<String, String> getAdditionalData() {
		return additionalData;
	}

	public void setAdditionalData(Map<String, String> additionalData) {
		this.additionalData = additionalData;
	}
}
