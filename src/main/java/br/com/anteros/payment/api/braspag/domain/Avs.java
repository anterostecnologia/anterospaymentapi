package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Avs {
	
	@JsonProperty("Cpf")
	private String cpf;
	
	@JsonProperty("ZipCode")
	private String zipCode;
	
	@JsonProperty("Street")
	private String street;
	
	@JsonProperty("Number")
	private String number;
	
	@JsonProperty("Complement")
	private String complement;
	
	@JsonProperty("District")
	private String district;
	
	@JsonProperty("Status")
	private int status;
	
	@JsonProperty("ReturnCode")
	private String returnCode;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

}
