package br.com.anteros.payment.api.braspag.domain.antifraud;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CartData {
	
	@JsonProperty("IsGift")
	private boolean isGift;
	
	@JsonProperty("ReturnsAccepted")
    private boolean returnsAccepted;
	
	@JsonProperty("items")
    private List<ItemData> Items;

	public boolean isGift() {
		return isGift;
	}

	public void setGift(boolean isGift) {
		this.isGift = isGift;
	}

	public boolean isReturnsAccepted() {
		return returnsAccepted;
	}

	public void setReturnsAccepted(boolean returnsAccepted) {
		this.returnsAccepted = returnsAccepted;
	}

	public List<ItemData> getItems() {
		return Items;
	}

	public void setItems(List<ItemData> items) {
		Items = items;
	}

}
