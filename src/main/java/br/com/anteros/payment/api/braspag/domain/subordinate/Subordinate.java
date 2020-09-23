package br.com.anteros.payment.api.braspag.domain.subordinate;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Subordinate {
	
	@JsonProperty("MasterMerchantId")
	private String masterMerchantId;
	
	@JsonProperty("MerchantId")
	private String merchantId;
	
	@JsonProperty("CorporateName")
	private String corporateName;
	
	@JsonProperty("FancyName")
    private String fancyName;
	
	@JsonProperty("DocumentNumber")
    private String documentNumber;
	
	@JsonProperty("DocumentType")
    private String documentType;
	
	@JsonProperty("MerchantCategoryCode")
    private String merchantCategoryCode;
	
	@JsonProperty("ContactName")
    private String contactName;
	
	@JsonProperty("ContactPhone")
    private String contactPhone;
	
	@JsonProperty("MailAddress")
    private String mailAddress;
	
	@JsonProperty("Website")
    private String website;
	
	@JsonProperty("Blocked")
	private boolean blocked;
	
	@JsonProperty("BankAccount")
	private BankAccount bankAccount;
	
	@JsonProperty("Agreement")
	private Agreement agreement;
	
	@JsonProperty("Notification")
	private Notification notification;
	
	@JsonProperty("Attachments")
	private List<Attachment> attachments;
	
	@JsonProperty("analysis")
	private Analysis Analysis;
	
	@JsonProperty("Address")
	private SubordinateAddress address;

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public String getFancyName() {
		return fancyName;
	}

	public void setFancyName(String fancyName) {
		this.fancyName = fancyName;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public List<Attachment> getAttachments() {
		if (attachments==null) {
			attachments = new ArrayList<Attachment>();
		}
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Agreement getAgreement() {
		return agreement;
	}

	public void setAgreement(Agreement agreement) {
		this.agreement = agreement;
	}

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	public String getMasterMerchantId() {
		return masterMerchantId;
	}

	public void setMasterMerchantId(String masterMerchantId) {
		this.masterMerchantId = masterMerchantId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public Analysis getAnalysis() {
		return Analysis;
	}

	public void setAnalysis(Analysis analysis) {
		Analysis = analysis;
	}

	public SubordinateAddress getAddress() {
		return address;
	}

	public void setAddress(SubordinateAddress address) {
		this.address = address;
	}

}
