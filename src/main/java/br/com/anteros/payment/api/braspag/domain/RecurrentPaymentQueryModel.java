package br.com.anteros.payment.api.braspag.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.anteros.payment.api.braspag.domain.enums.ProviderType;

public class RecurrentPaymentQueryModel {
	
	@JsonProperty("RecurrentPaymentId")
	private String recurrentPaymentId;

	@JsonProperty("ReasonCode")
    private int reasonCode;

	@JsonProperty("ReasonMessage")
    private String reasonMessage;

	@JsonProperty("NextRecurrency")
    private Date nextRecurrency;

	@JsonProperty("StartDate")
    private Date startDate;

	@JsonProperty("EndDate")
    private Date endDate;

	@JsonProperty("Interval")
    private RecurrentPayment.Interval interval;

	@JsonProperty("Link")
    private Link link;

	@JsonProperty("AuthorizeNow")
    private boolean authorizeNow;

	@JsonProperty("Installments")
    private short installments;
	
	@JsonProperty("Amount")
    private long amount;
	
	@JsonProperty("Country")
    private String country;
	
	@JsonProperty("CreateDate")
    private Date createDate;
	
	@JsonProperty("Currency")
    private String currency;
	
	@JsonProperty("CurrentRecurrencyTry")
    private short currentRecurrencyTry;
	
	@JsonProperty("NextRetry")
    private Date nextRetry;
	
	@JsonProperty("OrderNumber")
    private String orderNumber;
	
	@JsonProperty("Provider")
    private ProviderType provider;
	
	@JsonProperty("recurrencyDay")
    private byte RecurrencyDay;
	
	@JsonProperty("SuccessfulRecurrences")
    private short successfulRecurrences;

	@JsonProperty("Links")
    private List<Link> links;

	@JsonProperty("RecurrentTransactions")
    private List<RecurrentTransaction> recurrentTransactions;

	@JsonProperty("Status")
    private Integer status;

	public String getRecurrentPaymentId() {
		return recurrentPaymentId;
	}

	public void setRecurrentPaymentId(String recurrentPaymentId) {
		this.recurrentPaymentId = recurrentPaymentId;
	}

	public int getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(int reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReasonMessage() {
		return reasonMessage;
	}

	public void setReasonMessage(String reasonMessage) {
		this.reasonMessage = reasonMessage;
	}

	public Date getNextRecurrency() {
		return nextRecurrency;
	}

	public void setNextRecurrency(Date nextRecurrency) {
		this.nextRecurrency = nextRecurrency;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public RecurrentPayment.Interval getInterval() {
		return interval;
	}

	public void setInterval(RecurrentPayment.Interval interval) {
		this.interval = interval;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public boolean isAuthorizeNow() {
		return authorizeNow;
	}

	public void setAuthorizeNow(boolean authorizeNow) {
		this.authorizeNow = authorizeNow;
	}

	public short getInstallments() {
		return installments;
	}

	public void setInstallments(short installments) {
		this.installments = installments;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public short getCurrentRecurrencyTry() {
		return currentRecurrencyTry;
	}

	public void setCurrentRecurrencyTry(short currentRecurrencyTry) {
		this.currentRecurrencyTry = currentRecurrencyTry;
	}

	public Date getNextRetry() {
		return nextRetry;
	}

	public void setNextRetry(Date nextRetry) {
		this.nextRetry = nextRetry;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public byte getRecurrencyDay() {
		return RecurrencyDay;
	}

	public void setRecurrencyDay(byte recurrencyDay) {
		RecurrencyDay = recurrencyDay;
	}

	public short getSuccessfulRecurrences() {
		return successfulRecurrences;
	}

	public void setSuccessfulRecurrences(short successfulRecurrences) {
		this.successfulRecurrences = successfulRecurrences;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public List<RecurrentTransaction> getRecurrentTransactions() {
		return recurrentTransactions;
	}

	public void setRecurrentTransactions(List<RecurrentTransaction> recurrentTransactions) {
		this.recurrentTransactions = recurrentTransactions;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public ProviderType getProvider() {
		return provider;
	}

	public void setProvider(ProviderType provider) {
		this.provider = provider;
	}

}
