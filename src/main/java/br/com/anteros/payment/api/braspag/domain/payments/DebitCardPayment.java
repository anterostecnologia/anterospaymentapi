package br.com.anteros.payment.api.braspag.domain.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import br.com.anteros.payment.api.braspag.domain.Card;
import br.com.anteros.payment.api.braspag.domain.Payment;
import br.com.anteros.payment.api.braspag.domain.Wallet;

@JsonTypeName("DebitCard")
public class DebitCardPayment extends Payment {

	private DebitCardPayment() {
		
	}

	@JsonProperty("Authenticate")
	private boolean authenticate;

	@JsonProperty("Recurrent")
	private boolean recurrent;

	@JsonProperty("DebitCard")
	private Card debitCard;

	@JsonProperty("AuthenticationUrl")
	private String authenticationUrl;

	@JsonProperty("ProofOfSale")
	private String proofOfSale;

	@JsonProperty("AcquirerTransactionId")
	private String acquirerTransactionId;

	@JsonProperty("AuthorizationCode")
	private String authorizationCode;

	@JsonProperty("SoftDescriptor")
	private String softDescriptor;

	@JsonProperty("Eci")
	private String eci;

	@JsonProperty("IssuerTransactionId")
	private String issuerTransactionId;

	@JsonProperty("Wallet")
	private Wallet wallet;

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

	public Card getDebitCard() {
		return debitCard;
	}

	public void setDebitCard(Card debitCard) {
		this.debitCard = debitCard;
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

	public String getEci() {
		return eci;
	}

	public void setEci(String eci) {
		this.eci = eci;
	}

	public String getIssuerTransactionId() {
		return issuerTransactionId;
	}

	public void setIssuerTransactionId(String issuerTransactionId) {
		this.issuerTransactionId = issuerTransactionId;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "DebitCardPayment [authenticate=" + authenticate + ", recurrent=" + recurrent + ", debitCard="
				+ debitCard + ", authenticationUrl=" + authenticationUrl + ", proofOfSale=" + proofOfSale
				+ ", acquirerTransactionId=" + acquirerTransactionId + ", authorizationCode=" + authorizationCode
				+ ", softDescriptor=" + softDescriptor + ", eci=" + eci + ", issuerTransactionId=" + issuerTransactionId
				+ ", wallet=" + wallet + "]";
	}

}
