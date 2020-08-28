package br.com.anteros.payment.api.braspag.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import br.com.anteros.payment.api.braspag.domain.enums.CurrencyType;
import br.com.anteros.payment.api.braspag.domain.enums.ProviderType;
import br.com.anteros.payment.api.braspag.domain.payments.BoletoPayment;
import br.com.anteros.payment.api.braspag.domain.payments.CreditCardPayment;
import br.com.anteros.payment.api.braspag.domain.payments.DebitCardPayment;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "Type")
@JsonSubTypes(value = { @Type(value = BoletoPayment.class, name = "Boleto"),
		@Type(value = CreditCardPayment.class, name = "CreditCard"),
		@Type(value = DebitCardPayment.class, name = "DebitCard") })
public abstract class Payment {

	@JsonProperty("PaymentId")
	private String paymentId;

	@JsonProperty("Type")
	private String type;

	@JsonProperty("Amount")
	private long amount;

	@JsonProperty("ReceivedDate")
	@JsonFormat(
			  shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", locale = "pt_BR")
	private Date receivedDate;

	@JsonProperty("CapturedAmount")
	private long capturedAmount;

	@JsonProperty("VoidedAmount")
	private long voidedAmount;

	@JsonProperty("Currency")
	private CurrencyType currency = CurrencyType.BRL;

	@JsonProperty("Country")
	private String country = "BRA";

	@JsonProperty("Provider")
	private ProviderType provider;

	@JsonProperty("Credentials")
	private PaymentCredentials credentials;

	@JsonProperty("ReturnUrl")
	private String returnUrl;

	@JsonProperty("ExtraDataCollection")
	private List<ExtraData> extraDataCollection;

	@JsonProperty("ReasonCode")
	private byte reasonCode;

	@JsonProperty("ReasonMessage")
	private String reasonMessage;

	@JsonProperty("ProviderReturnCode")
	private String providerReturnCode;

	@JsonProperty("ProviderReturnMessage")
	private String providerReturnMessage;

	@JsonProperty("Status")
	private int status;

	@JsonProperty("RecurrentPayment")
	private RecurrentPayment recurrentPayment;

	@JsonProperty("Links")
	private List<Link> links;

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public long getCapturedAmount() {
		return capturedAmount;
	}

	public void setCapturedAmount(long capturedAmount) {
		this.capturedAmount = capturedAmount;
	}

	public long getVoidedAmount() {
		return voidedAmount;
	}

	public void setVoidedAmount(long voidedAmount) {
		this.voidedAmount = voidedAmount;
	}

	public CurrencyType getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyType currency) {
		this.currency = currency;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ProviderType getProvider() {
		return provider;
	}

	public void setProvider(ProviderType provider) {
		this.provider = provider;
	}

	public PaymentCredentials getCredentials() {
		return credentials;
	}

	public void setCredentials(PaymentCredentials credentials) {
		this.credentials = credentials;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public List<ExtraData> getExtraDataCollection() {
		return extraDataCollection;
	}

	public void setExtraDataCollection(List<ExtraData> extraDataCollection) {
		this.extraDataCollection = extraDataCollection;
	}

	public byte getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(byte reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReasonMessage() {
		return reasonMessage;
	}

	public void setReasonMessage(String reasonMessage) {
		this.reasonMessage = reasonMessage;
	}

	public String getProviderReturnCode() {
		return providerReturnCode;
	}

	public void setProviderReturnCode(String providerReturnCode) {
		this.providerReturnCode = providerReturnCode;
	}

	public String getProviderReturnMessage() {
		return providerReturnMessage;
	}

	public void setProviderReturnMessage(String providerReturnMessage) {
		this.providerReturnMessage = providerReturnMessage;
	}

	public int getStatus() {
		return status;
	}

	public RecurrentPayment getRecurrentPayment() {
		return recurrentPayment;
	}

	public void setRecurrentPayment(RecurrentPayment recurrentPayment) {
		this.recurrentPayment = recurrentPayment;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", type=" + type + ", amount=" + amount + ", receivedDate="
				+ receivedDate + ", capturedAmount=" + capturedAmount + ", voidedAmount=" + voidedAmount + ", currency="
				+ currency + ", country=" + country + ", provider=" + provider + ", credentials=" + credentials
				+ ", returnUrl=" + returnUrl + ", extraDataCollection=" + extraDataCollection + ", reasonCode="
				+ reasonCode + ", reasonMessage=" + reasonMessage + ", providerReturnCode=" + providerReturnCode
				+ ", providerReturnMessage=" + providerReturnMessage + ", status=" + status + ", recurrentPayment="
				+ recurrentPayment + ", links=" + links + "]";
	}

}