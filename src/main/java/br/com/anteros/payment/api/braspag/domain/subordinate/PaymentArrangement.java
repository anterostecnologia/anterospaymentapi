package br.com.anteros.payment.api.braspag.domain.subordinate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentArrangement {
	
	@JsonProperty("Product")
	private ProductType product;
	
	@JsonProperty("Brand")
    private BrandType brand;

	public ProductType getProduct() {
		return product;
	}

	public void setProduct(ProductType product) {
		this.product = product;
	}

	public BrandType getBrand() {
		return brand;
	}

	public void setBrand(BrandType brand) {
		this.brand = brand;
	}


}
