package br.com.anteros.payment.api.braspag.domain.antifraud;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.anteros.payment.api.braspag.domain.enums.GiftCategoryType;
import br.com.anteros.payment.api.braspag.domain.enums.HedgeType;
import br.com.anteros.payment.api.braspag.domain.enums.ProductType;

public class ItemData {

	@JsonProperty("Type")
	private ProductType type ;

	@JsonProperty("Name")
    private String name ;
	
	@JsonProperty("Risk")
    private HedgeType risk ;

	@JsonProperty("Sku")
    private String sku ;
	
	@JsonProperty("UnitPrice")
    private long unitPrice ;
	
	@JsonProperty("Quantity")
    private int quantity ;

	@JsonProperty("HostHedge")
    private HedgeType hostHedge ;
	
	@JsonProperty("NonSensicalHedge")
    private HedgeType nonSensicalHedge ;
	
	@JsonProperty("ObscenitiesHedge")
    private HedgeType obscenitiesHedge ;
	
	@JsonProperty("PhoneHedge")
    private HedgeType phoneHedge ;
	
	@JsonProperty("TimeHedge")
    private HedgeType timeHedge ;
	
	@JsonProperty("VelocityHedge")
    private HedgeType velocityHedge ;
	
	@JsonProperty("GiftCategory")
    private GiftCategoryType giftCategory ;

	@JsonProperty("Passenger")
    private PassengerData passenger ;

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HedgeType getRisk() {
		return risk;
	}

	public void setRisk(HedgeType risk) {
		this.risk = risk;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public long getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(long unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public HedgeType getHostHedge() {
		return hostHedge;
	}

	public void setHostHedge(HedgeType hostHedge) {
		this.hostHedge = hostHedge;
	}

	public HedgeType getNonSensicalHedge() {
		return nonSensicalHedge;
	}

	public void setNonSensicalHedge(HedgeType nonSensicalHedge) {
		this.nonSensicalHedge = nonSensicalHedge;
	}

	public HedgeType getObscenitiesHedge() {
		return obscenitiesHedge;
	}

	public void setObscenitiesHedge(HedgeType obscenitiesHedge) {
		this.obscenitiesHedge = obscenitiesHedge;
	}

	public HedgeType getPhoneHedge() {
		return phoneHedge;
	}

	public void setPhoneHedge(HedgeType phoneHedge) {
		this.phoneHedge = phoneHedge;
	}

	public HedgeType getTimeHedge() {
		return timeHedge;
	}

	public void setTimeHedge(HedgeType timeHedge) {
		this.timeHedge = timeHedge;
	}

	public HedgeType getVelocityHedge() {
		return velocityHedge;
	}

	public void setVelocityHedge(HedgeType velocityHedge) {
		this.velocityHedge = velocityHedge;
	}

	public GiftCategoryType getGiftCategory() {
		return giftCategory;
	}

	public void setGiftCategory(GiftCategoryType giftCategory) {
		this.giftCategory = giftCategory;
	}

	public PassengerData getPassenger() {
		return passenger;
	}

	public void setPassenger(PassengerData passenger) {
		this.passenger = passenger;
	}
    
}
