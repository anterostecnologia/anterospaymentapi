package br.com.anteros.payment.api.braspag.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RecurrentPayment {
	
	@JsonProperty("RecurrentPaymentId")
	private String recurrentPaymentId;

	@JsonProperty("ReasonCode")
	private int reasonCode;

	@JsonProperty("ReasonMessage")
	private String reasonMessage;

	@JsonProperty("NextRecurrency")
	@JsonFormat(
			  shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", locale = "pt_BR")
	private Date nextRecurrency;

	@JsonProperty("Link")
	private Link link;
	
	@JsonProperty("AuthorizeNow")
    private boolean authorizeNow;
	
	@JsonProperty("StartDate")
    private String startDate;
	
	@JsonProperty("EndDate")
    private String endDate;
	
	@JsonProperty("Interval")
    private Interval interval;

    public RecurrentPayment(boolean authorizeNow) {
        this.authorizeNow = authorizeNow;
    }

    public boolean isAuthorizeNow() {
        return authorizeNow;
    }

    public RecurrentPayment setAuthorizeNow(boolean authorizeNow) {
        this.authorizeNow = authorizeNow;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public RecurrentPayment setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public Interval getInterval() {
        return interval;
    }

    public RecurrentPayment setInterval(Interval interval) {
        this.interval = interval;
        return this;
    }

    public enum Interval {
        Monthly,
        Bimonthly,
        Quarterly,
        SemiAnnual,
        Annual
    }

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

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
}