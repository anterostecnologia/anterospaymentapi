package br.com.anteros.payment.api.braspag.domain.antifraud;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.anteros.payment.api.braspag.domain.enums.AntifraudSequenceCriteriaType;
import br.com.anteros.payment.api.braspag.domain.enums.AntifraudSequenceType;

public class FraudAnalysisData {

	@JsonProperty("Sequence")
	private AntifraudSequenceType sequence ;

	@JsonProperty("SequenceCriteria")
    private AntifraudSequenceCriteriaType sequenceCriteria ;

	@JsonProperty("FingerPrintId")
    private String fingerPrintId ;

	@JsonProperty("MerchantDefinedFields")
    private List<MerchantDefinedField> merchantDefinedFields ;

	@JsonProperty("Cart")
    private CartData cart ;

	@JsonProperty("Travel")
    private TravelData travel ;

	@JsonProperty("Browser")
    private BrowserData browser ;

	@JsonProperty("Shipping")
    private ShippingData shipping ;

	@JsonProperty("Id")
    private String id ;

	@JsonProperty("Status")
    private byte status ;

	@JsonProperty("FraudAnalysisReasonCode")
    private int fraudAnalysisReasonCode ;

	@JsonProperty("ReplyData")
    private ReplyData replyData ;

	@JsonProperty("InvalidFields")
    private List<String> invalidFields ;

	@JsonProperty("CaptureOnLowRisk")
    private boolean captureOnLowRisk ;
	
	@JsonProperty("VoidOnHighRisk")
    private boolean voidOnHighRisk ;

	public AntifraudSequenceType getSequence() {
		return sequence;
	}

	public void setSequence(AntifraudSequenceType sequence) {
		this.sequence = sequence;
	}

	public AntifraudSequenceCriteriaType getSequenceCriteria() {
		return sequenceCriteria;
	}

	public void setSequenceCriteria(AntifraudSequenceCriteriaType sequenceCriteria) {
		this.sequenceCriteria = sequenceCriteria;
	}

	public String getFingerPrintId() {
		return fingerPrintId;
	}

	public void setFingerPrintId(String fingerPrintId) {
		this.fingerPrintId = fingerPrintId;
	}

	public List<MerchantDefinedField> getMerchantDefinedFields() {
		return merchantDefinedFields;
	}

	public void setMerchantDefinedFields(List<MerchantDefinedField> merchantDefinedFields) {
		this.merchantDefinedFields = merchantDefinedFields;
	}

	public CartData getCart() {
		return cart;
	}

	public void setCart(CartData cart) {
		this.cart = cart;
	}

	public TravelData getTravel() {
		return travel;
	}

	public void setTravel(TravelData travel) {
		this.travel = travel;
	}

	public BrowserData getBrowser() {
		return browser;
	}

	public void setBrowser(BrowserData browser) {
		this.browser = browser;
	}

	public ShippingData getShipping() {
		return shipping;
	}

	public void setShipping(ShippingData shipping) {
		this.shipping = shipping;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public int getFraudAnalysisReasonCode() {
		return fraudAnalysisReasonCode;
	}

	public void setFraudAnalysisReasonCode(int fraudAnalysisReasonCode) {
		this.fraudAnalysisReasonCode = fraudAnalysisReasonCode;
	}

	public ReplyData getReplyData() {
		return replyData;
	}

	public void setReplyData(ReplyData replyData) {
		this.replyData = replyData;
	}

	public List<String> getInvalidFields() {
		return invalidFields;
	}

	public void setInvalidFields(List<String> invalidFields) {
		this.invalidFields = invalidFields;
	}

	public boolean isCaptureOnLowRisk() {
		return captureOnLowRisk;
	}

	public void setCaptureOnLowRisk(boolean captureOnLowRisk) {
		this.captureOnLowRisk = captureOnLowRisk;
	}

	public boolean isVoidOnHighRisk() {
		return voidOnHighRisk;
	}

	public void setVoidOnHighRisk(boolean voidOnHighRisk) {
		this.voidOnHighRisk = voidOnHighRisk;
	}
}
