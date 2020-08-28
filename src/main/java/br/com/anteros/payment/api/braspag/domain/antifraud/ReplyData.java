package br.com.anteros.payment.api.braspag.domain.antifraud;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReplyData {
	
	@JsonProperty("AddressInfoCode")
	private String addressInfoCode ;
	
	@JsonProperty("FactorCode")
    private String factorCode ;
	
	@JsonProperty("Score")
    private int score ;
	
	@JsonProperty("BinCountry")
    private String binCountry ;
	
	@JsonProperty("CardIssuer")
    private String cardIssuer ;
	
	@JsonProperty("CardScheme")
    private String cardScheme ;
	
	@JsonProperty("HostSeverity")
    private int hostSeverity ;
	
	@JsonProperty("HotListInfoCode")
    private String hotListInfoCode ;
	
	@JsonProperty("IdentityInfoCode")
    private String identityInfoCode ;
	
	@JsonProperty("InternetInfoCode")
    private String internetInfoCode ;
	
	@JsonProperty("IpCity")
    private String ipCity ;
	
	@JsonProperty("IpCountry")
    private String ipCountry ;
	
	@JsonProperty("IpRoutingMethod")
    private String ipRoutingMethod ;
	
	@JsonProperty("IpState")
    private String ipState ;
	
	@JsonProperty("PhoneInfoCode")
    private String phoneInfoCode ;
	
	@JsonProperty("ScoreModelUsed")
    private String scoreModelUsed ;
	
	@JsonProperty("VelocityInfoCode")
    private String velocityInfoCode ;
	
	@JsonProperty("CasePriority")
    private int casePriority ;
	
	@JsonProperty("FingerPrint")
    private FingerPrintData fingerPrint ;

	public String getAddressInfoCode() {
		return addressInfoCode;
	}

	public void setAddressInfoCode(String addressInfoCode) {
		this.addressInfoCode = addressInfoCode;
	}

	public String getFactorCode() {
		return factorCode;
	}

	public void setFactorCode(String factorCode) {
		this.factorCode = factorCode;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getBinCountry() {
		return binCountry;
	}

	public void setBinCountry(String binCountry) {
		this.binCountry = binCountry;
	}

	public String getCardIssuer() {
		return cardIssuer;
	}

	public void setCardIssuer(String cardIssuer) {
		this.cardIssuer = cardIssuer;
	}

	public String getCardScheme() {
		return cardScheme;
	}

	public void setCardScheme(String cardScheme) {
		this.cardScheme = cardScheme;
	}

	public int getHostSeverity() {
		return hostSeverity;
	}

	public void setHostSeverity(int hostSeverity) {
		this.hostSeverity = hostSeverity;
	}

	public String getHotListInfoCode() {
		return hotListInfoCode;
	}

	public void setHotListInfoCode(String hotListInfoCode) {
		this.hotListInfoCode = hotListInfoCode;
	}

	public String getIdentityInfoCode() {
		return identityInfoCode;
	}

	public void setIdentityInfoCode(String identityInfoCode) {
		this.identityInfoCode = identityInfoCode;
	}

	public String getInternetInfoCode() {
		return internetInfoCode;
	}

	public void setInternetInfoCode(String internetInfoCode) {
		this.internetInfoCode = internetInfoCode;
	}

	public String getIpCity() {
		return ipCity;
	}

	public void setIpCity(String ipCity) {
		this.ipCity = ipCity;
	}

	public String getIpCountry() {
		return ipCountry;
	}

	public void setIpCountry(String ipCountry) {
		this.ipCountry = ipCountry;
	}

	public String getIpRoutingMethod() {
		return ipRoutingMethod;
	}

	public void setIpRoutingMethod(String ipRoutingMethod) {
		this.ipRoutingMethod = ipRoutingMethod;
	}

	public String getIpState() {
		return ipState;
	}

	public void setIpState(String ipState) {
		this.ipState = ipState;
	}

	public String getPhoneInfoCode() {
		return phoneInfoCode;
	}

	public void setPhoneInfoCode(String phoneInfoCode) {
		this.phoneInfoCode = phoneInfoCode;
	}

	public String getScoreModelUsed() {
		return scoreModelUsed;
	}

	public void setScoreModelUsed(String scoreModelUsed) {
		this.scoreModelUsed = scoreModelUsed;
	}

	public String getVelocityInfoCode() {
		return velocityInfoCode;
	}

	public void setVelocityInfoCode(String velocityInfoCode) {
		this.velocityInfoCode = velocityInfoCode;
	}

	public int getCasePriority() {
		return casePriority;
	}

	public void setCasePriority(int casePriority) {
		this.casePriority = casePriority;
	}

	public FingerPrintData getFingerPrint() {
		return fingerPrint;
	}

	public void setFingerPrint(FingerPrintData fingerPrint) {
		this.fingerPrint = fingerPrint;
	}

}
