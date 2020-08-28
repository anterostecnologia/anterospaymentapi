package br.com.anteros.payment.api.braspag.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Email")
    private String email;
    
	@JsonProperty("BirthDate")
	private String birthDate;
    
	@JsonProperty("Identity")
    private String identity;
    
	@JsonProperty("IdentityType")
	private String identityType;
	
	@JsonProperty("Address")
    private Address address;
    
	@JsonProperty("DeliveryAddress")
    private Address deliveryAddress;
	
	
	public Customer() {
		
	}
    
    

    public Customer(String name) {
        setName(name);
    }

    public Address address() {
        setAddress(new Address());

        return getAddress();
    }

    public Address deliveryAddress() {
        setDeliveryAddress(new Address());

        return getDeliveryAddress();
    }

    public Address getAddress() {
        return address;
    }

    public Customer setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public Customer setDeliveryAddress(Address address) {
        this.deliveryAddress = address;
        return this;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Customer setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getIdentity() {
        return identity;
    }

    public String getIdentityType() {
        return identityType;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", identity=" + identity
				+ ", identityType=" + identityType + ", address=" + address + ", deliveryAddress=" + deliveryAddress
				+ "]";
	}
	
	
}
