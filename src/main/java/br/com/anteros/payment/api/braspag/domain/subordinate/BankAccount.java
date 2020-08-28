package br.com.anteros.payment.api.braspag.domain.subordinate;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.anteros.payment.api.braspag.domain.enums.BankAccountType;
import br.com.anteros.payment.api.braspag.domain.enums.DocumentType;

public class BankAccount {
	
	@JsonProperty("Bank")
	private String bank;
	
	@JsonProperty("BankAccountType")
	private BankAccountType bankAccountType;  
	
	@JsonProperty("Number")
	private Long number;
	
	@JsonProperty("Operation")
	private String operation;
	
	@JsonProperty("VerifierDigit")
	private String verifierDigit;
	
	@JsonProperty("AgencyNumber")
	private Long agencyNumber;
	
	@JsonProperty("AgencyDigit")
	private String agencyDigit;
	
	@JsonProperty("DocumentNumber")
	private String documentNumber;
	
	@JsonProperty("DocumentType")
	private DocumentType documentType;

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public BankAccountType getBankAccountType() {
		return bankAccountType;
	}

	public void setBankAccountType(BankAccountType bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getVerifierDigit() {
		return verifierDigit;
	}

	public void setVerifierDigit(String verifierDigit) {
		this.verifierDigit = verifierDigit;
	}

	public Long getAgencyNumber() {
		return agencyNumber;
	}

	public void setAgencyNumber(Long agencyNumber) {
		this.agencyNumber = agencyNumber;
	}

	public String getAgencyDigit() {
		return agencyDigit;
	}

	public void setAgencyDigit(String agencyDigit) {
		this.agencyDigit = agencyDigit;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

}
