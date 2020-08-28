package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.anteros.payment.api.braspag.domain.enums.ProviderType;

public class VerifyCardRequest {

	@JsonProperty("Card")
	private Card card;
    
	@JsonProperty("Provider")
    private ProviderType provider;

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public ProviderType getProvider() {
		return provider;
	}

	public void setProvider(ProviderType provider) {
		this.provider = provider;
	}

}
