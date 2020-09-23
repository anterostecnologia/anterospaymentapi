package br.com.anteros.payment.api.braspag.domain.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import br.com.anteros.payment.api.braspag.domain.Payment;

@JsonTypeName("SplittedBoleto")
public class SplittedBoletoPayment extends Payment {	

	@JsonProperty("Instructions")
	private String instructions;

	@JsonProperty("ExpirationDate")
	private String expirationDate;

	@JsonProperty("Demostrative")
	private String demostrative;

	@JsonProperty("Url")
	private String url;

	@JsonProperty("BoletoNumber")
	private String boletoNumber;

	@JsonProperty("BarCodeNumber")
	private String barCodeNumber;

	@JsonProperty("DigitableLine")
	private String digitableLine;

	@JsonProperty("Assignor")
	private String assignor;

	@JsonProperty("Identification")
	private String identification;

	@JsonProperty("IsRecurring")
    private boolean isRecurring;
	
	@JsonProperty("Address")
	private String address;
	
	@JsonProperty("Bank")
	private String bank;
	
	@JsonProperty("Status")
	private int status;
	
	public SplittedBoletoPayment() {
		
	}
	

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getDemostrative() {
		return demostrative;
	}

	public void setDemostrative(String demostrative) {
		this.demostrative = demostrative;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBoletoNumber() {
		return boletoNumber;
	}

	public void setBoletoNumber(String boletoNumber) {
		this.boletoNumber = boletoNumber;
	}

	public String getBarCodeNumber() {
		return barCodeNumber;
	}

	public void setBarCodeNumber(String barCodeNumber) {
		this.barCodeNumber = barCodeNumber;
	}

	public String getDigitableLine() {
		return digitableLine;
	}

	public void setDigitableLine(String digitableLine) {
		this.digitableLine = digitableLine;
	}

	public String getAssignor() {
		return assignor;
	}

	public void setAssignor(String assignor) {
		this.assignor = assignor;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public boolean isRecurring() {
		return isRecurring;
	}

	public void setRecurring(boolean isRecurring) {
		this.isRecurring = isRecurring;
	}


	@Override
	public String toString() {
		return "BoletoPayment [instructions=" + instructions + ", expirationDate=" + expirationDate + ", demostrative="
				+ demostrative + ", url=" + url + ", boletoNumber=" + boletoNumber + ", barCodeNumber=" + barCodeNumber
				+ ", digitableLine=" + digitableLine + ", assignor=" + assignor + ", identification=" + identification
				+ ", isRecurring=" + isRecurring + "]";
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getBank() {
		return bank;
	}


	public void setBank(String bank) {
		this.bank = bank;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


}
