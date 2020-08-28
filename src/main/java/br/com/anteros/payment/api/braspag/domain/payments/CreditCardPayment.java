package br.com.anteros.payment.api.braspag.domain.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import br.com.anteros.payment.api.braspag.domain.Card;
import br.com.anteros.payment.api.braspag.domain.ExternalAuthentication;
import br.com.anteros.payment.api.braspag.domain.Payment;
import br.com.anteros.payment.api.braspag.domain.Wallet;
import br.com.anteros.payment.api.braspag.domain.antifraud.FraudAnalysisData;
import br.com.anteros.payment.api.braspag.domain.enums.InterestType;

@JsonTypeName("CreditCard")
public class CreditCardPayment extends Payment {
	
	public CreditCardPayment()
	{
		this.setType("CreditCard");
	}
	
	@JsonProperty("ServiceTaxAmount")
	public long serviceTaxAmount;

	@JsonProperty("Installments")
	public short installments;

	@JsonProperty("Interest")
	public InterestType interest;

	@JsonProperty("Capture")
	public boolean capture;

	@JsonProperty("Authenticate")
	public boolean authenticate;

	@JsonProperty("Recurrent")
    public boolean recurrent;

	@JsonProperty("CreditCard")
	public Card creditCard;

	@JsonProperty("AuthenticationUrl")
	public String authenticationUrl;

	@JsonProperty("ProofOfSale")
	public String proofOfSale;
	
	@JsonProperty("AcquirerTransactionId")
	public String acquirerTransactionId;
	
	@JsonProperty("AuthorizationCode")
	public String authorizationCode;

	@JsonProperty("SoftDescriptor")
	public String softDescriptor;

	@JsonProperty("FraudAnalysis")
    public FraudAnalysisData fraudAnalysis;

	@JsonProperty("ExternalAuthentication")
    public ExternalAuthentication externalAuthentication;

	@JsonProperty("NewCard")
    public Card newCard;

	@JsonProperty("Wallet")
    public Wallet wallet;

	public long getServiceTaxAmount() {
		return serviceTaxAmount;
	}

	public void setServiceTaxAmount(long serviceTaxAmount) {
		this.serviceTaxAmount = serviceTaxAmount;
	}

	public short getInstallments() {
		return installments;
	}

	public void setInstallments(short installments) {
		this.installments = installments;
	}

	public InterestType getInterest() {
		return interest;
	}

	public void setInterest(InterestType interest) {
		this.interest = interest;
	}

	public boolean isCapture() {
		return capture;
	}

	public void setCapture(boolean capture) {
		this.capture = capture;
	}

	public boolean isAuthenticate() {
		return authenticate;
	}

	public void setAuthenticate(boolean authenticate) {
		this.authenticate = authenticate;
	}

	public boolean isRecurrent() {
		return recurrent;
	}

	public void setRecurrent(boolean recurrent) {
		this.recurrent = recurrent;
	}

	public Card getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(Card creditCard) {
		this.creditCard = creditCard;
	}

	public String getAuthenticationUrl() {
		return authenticationUrl;
	}

	public void setAuthenticationUrl(String authenticationUrl) {
		this.authenticationUrl = authenticationUrl;
	}

	public String getProofOfSale() {
		return proofOfSale;
	}

	public void setProofOfSale(String proofOfSale) {
		this.proofOfSale = proofOfSale;
	}

	public String getAcquirerTransactionId() {
		return acquirerTransactionId;
	}

	public void setAcquirerTransactionId(String acquirerTransactionId) {
		this.acquirerTransactionId = acquirerTransactionId;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public String getSoftDescriptor() {
		return softDescriptor;
	}

	public void setSoftDescriptor(String softDescriptor) {
		this.softDescriptor = softDescriptor;
	}

	public FraudAnalysisData getFraudAnalysis() {
		return fraudAnalysis;
	}

	public void setFraudAnalysis(FraudAnalysisData fraudAnalysis) {
		this.fraudAnalysis = fraudAnalysis;
	}

	public ExternalAuthentication getExternalAuthentication() {
		return externalAuthentication;
	}

	public void setExternalAuthentication(ExternalAuthentication externalAuthentication) {
		this.externalAuthentication = externalAuthentication;
	}

	public Card getNewCard() {
		return newCard;
	}

	public void setNewCard(Card newCard) {
		this.newCard = newCard;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "CreditCardPayment [serviceTaxAmount=" + serviceTaxAmount + ", installments=" + installments
				+ ", interest=" + interest + ", capture=" + capture + ", authenticate=" + authenticate + ", recurrent="
				+ recurrent + ", creditCard=" + creditCard + ", authenticationUrl=" + authenticationUrl
				+ ", proofOfSale=" + proofOfSale + ", acquirerTransactionId=" + acquirerTransactionId
				+ ", authorizationCode=" + authorizationCode + ", softDescriptor=" + softDescriptor + ", fraudAnalysis="
				+ fraudAnalysis + ", externalAuthentication=" + externalAuthentication + ", newCard=" + newCard
				+ ", wallet=" + wallet + "]";
	}

}
