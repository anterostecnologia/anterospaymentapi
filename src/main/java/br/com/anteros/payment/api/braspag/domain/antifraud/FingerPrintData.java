package br.com.anteros.payment.api.braspag.domain.antifraud;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FingerPrintData {
	
	@JsonProperty("CookiesEnabledField")
	private String cookiesEnabledField ;
	
	@JsonProperty("FlashEnabledField")
    private String flashEnabledField ;
	
	@JsonProperty("HashField")
    private String hashField ;
	
	@JsonProperty("ImagesEnabledField")
    private String imagesEnabledField ;
	
	@JsonProperty("JavascriptEnabledField")
    private String javascriptEnabledField ;
	
	@JsonProperty("ProxyIpAddressField")
    private String proxyIpAddressField ;
	
	@JsonProperty("ProxyIpAddressActivitiesField")
    private String proxyIpAddressActivitiesField ;
	
	@JsonProperty("ProxyIpAddressAttributesField")
    private String proxyIpAddressAttributesField ;
	
	@JsonProperty("ProxyServerTypeField")
    private String proxyServerTypeField ;
	
	@JsonProperty("TrueIpAddressField")
    private String trueIpAddressField ;
	
	@JsonProperty("TrueIpAddressActivitiesField")
    private String trueIpAddressActivitiesField ;
	
	@JsonProperty("TrueIpAddressAttributesField")
    private String trueIpAddressAttributesField ;
	
	@JsonProperty("TrueIpAddressCityField")
    private String trueIpAddressCityField ;
	
	@JsonProperty("TrueIpAddressCountryField")
    private String trueIpAddressCountryField ;
	
	@JsonProperty("SmartIdField")
    private String smartIdField ;
	
	@JsonProperty("SmartIdConfidenceLevelField")
    private String smartIdConfidenceLevelField ;
	
	@JsonProperty("ScreenResolutionField")
    private String screenResolutionField ;
	
	@JsonProperty("BrowserLanguageField")
    private String browserLanguageField ;

	public String getCookiesEnabledField() {
		return cookiesEnabledField;
	}

	public void setCookiesEnabledField(String cookiesEnabledField) {
		this.cookiesEnabledField = cookiesEnabledField;
	}

	public String getFlashEnabledField() {
		return flashEnabledField;
	}

	public void setFlashEnabledField(String flashEnabledField) {
		this.flashEnabledField = flashEnabledField;
	}

	public String getHashField() {
		return hashField;
	}

	public void setHashField(String hashField) {
		this.hashField = hashField;
	}

	public String getImagesEnabledField() {
		return imagesEnabledField;
	}

	public void setImagesEnabledField(String imagesEnabledField) {
		this.imagesEnabledField = imagesEnabledField;
	}

	public String getJavascriptEnabledField() {
		return javascriptEnabledField;
	}

	public void setJavascriptEnabledField(String javascriptEnabledField) {
		this.javascriptEnabledField = javascriptEnabledField;
	}

	public String getProxyIpAddressField() {
		return proxyIpAddressField;
	}

	public void setProxyIpAddressField(String proxyIpAddressField) {
		this.proxyIpAddressField = proxyIpAddressField;
	}

	public String getProxyIpAddressActivitiesField() {
		return proxyIpAddressActivitiesField;
	}

	public void setProxyIpAddressActivitiesField(String proxyIpAddressActivitiesField) {
		this.proxyIpAddressActivitiesField = proxyIpAddressActivitiesField;
	}

	public String getProxyIpAddressAttributesField() {
		return proxyIpAddressAttributesField;
	}

	public void setProxyIpAddressAttributesField(String proxyIpAddressAttributesField) {
		this.proxyIpAddressAttributesField = proxyIpAddressAttributesField;
	}

	public String getProxyServerTypeField() {
		return proxyServerTypeField;
	}

	public void setProxyServerTypeField(String proxyServerTypeField) {
		this.proxyServerTypeField = proxyServerTypeField;
	}

	public String getTrueIpAddressField() {
		return trueIpAddressField;
	}

	public void setTrueIpAddressField(String trueIpAddressField) {
		this.trueIpAddressField = trueIpAddressField;
	}

	public String getTrueIpAddressActivitiesField() {
		return trueIpAddressActivitiesField;
	}

	public void setTrueIpAddressActivitiesField(String trueIpAddressActivitiesField) {
		this.trueIpAddressActivitiesField = trueIpAddressActivitiesField;
	}

	public String getTrueIpAddressAttributesField() {
		return trueIpAddressAttributesField;
	}

	public void setTrueIpAddressAttributesField(String trueIpAddressAttributesField) {
		this.trueIpAddressAttributesField = trueIpAddressAttributesField;
	}

	public String getTrueIpAddressCityField() {
		return trueIpAddressCityField;
	}

	public void setTrueIpAddressCityField(String trueIpAddressCityField) {
		this.trueIpAddressCityField = trueIpAddressCityField;
	}

	public String getTrueIpAddressCountryField() {
		return trueIpAddressCountryField;
	}

	public void setTrueIpAddressCountryField(String trueIpAddressCountryField) {
		this.trueIpAddressCountryField = trueIpAddressCountryField;
	}

	public String getSmartIdField() {
		return smartIdField;
	}

	public void setSmartIdField(String smartIdField) {
		this.smartIdField = smartIdField;
	}

	public String getSmartIdConfidenceLevelField() {
		return smartIdConfidenceLevelField;
	}

	public void setSmartIdConfidenceLevelField(String smartIdConfidenceLevelField) {
		this.smartIdConfidenceLevelField = smartIdConfidenceLevelField;
	}

	public String getScreenResolutionField() {
		return screenResolutionField;
	}

	public void setScreenResolutionField(String screenResolutionField) {
		this.screenResolutionField = screenResolutionField;
	}

	public String getBrowserLanguageField() {
		return browserLanguageField;
	}

	public void setBrowserLanguageField(String browserLanguageField) {
		this.browserLanguageField = browserLanguageField;
	}

}
