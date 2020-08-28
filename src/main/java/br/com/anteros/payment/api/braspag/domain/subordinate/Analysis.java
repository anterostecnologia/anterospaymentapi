package br.com.anteros.payment.api.braspag.domain.subordinate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Analysis {

	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("Score")
	private int score;
	
	@JsonProperty("DenialReason")
	private String denialReason;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getDenialReason() {
		return denialReason;
	}

	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}

	
}
