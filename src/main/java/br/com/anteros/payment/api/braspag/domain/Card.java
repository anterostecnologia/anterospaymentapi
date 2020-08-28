package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.anteros.payment.api.braspag.domain.enums.BrandType;

public class Card {

	@JsonProperty("CardNumber")
	private String cardNumber;

	@JsonProperty("Holder")
	private String holder;

	@JsonProperty("ExpirationDate")
	private String expirationDate;

	@JsonProperty("SecurityCode")
	private String securityCode;

	@JsonProperty("SaveCard")
	private boolean saveCard = false;

	@JsonProperty("Brand")
	private BrandType brand;

	@JsonProperty("CardToken")
	private String cardToken;

	@JsonProperty("Cryptogram")
	private String cryptogram;

	@JsonProperty("Alias")
	private String alias;

	@JsonProperty("Avs")
	private Avs vs;

	@JsonProperty("CardOnFile")
	private CardOnFile cardOnFile;

	public Card() {
		
	}

	public Card(String securityCode, BrandType brand) {
		this.securityCode = securityCode;
		this.brand = brand;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public Card setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		return this;
	}

	public String getCardToken() {
		return cardToken;
	}

	public Card setCardToken(String cardToken) {
		this.cardToken = cardToken;
		return this;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public Card setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	public String getHolder() {
		return holder;
	}

	public Card setHolder(String holder) {
		this.holder = holder;
		return this;
	}

	public boolean isSaveCard() {
		return saveCard;
	}

	public Card setSaveCard(boolean saveCard) {
		this.saveCard = saveCard;
		return this;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public Card setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
		return this;
	}

	public String getCryptogram() {
		return cryptogram;
	}

	public void setCryptogram(String cryptogram) {
		this.cryptogram = cryptogram;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public BrandType getBrand() {
		return brand;
	}

	public void setBrand(BrandType brand) {
		this.brand = brand;
	}

	public Avs getVs() {
		return vs;
	}

	public void setVs(Avs vs) {
		this.vs = vs;
	}

	public CardOnFile getCardOnFile() {
		return cardOnFile;
	}

	public void setCardOnFile(CardOnFile cardOnFile) {
		this.cardOnFile = cardOnFile;
	}
}
