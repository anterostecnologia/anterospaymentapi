package br.com.anteros.payment.api.braspag.test;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.anteros.payment.api.braspag.domain.Address;
import br.com.anteros.payment.api.braspag.domain.Customer;
import br.com.anteros.payment.api.braspag.domain.MerchantAuthentication;
import br.com.anteros.payment.api.braspag.domain.Sale;
import br.com.anteros.payment.api.braspag.domain.enums.ProviderType;
import br.com.anteros.payment.api.braspag.domain.payments.BoletoPayment;
import br.com.anteros.payment.api.braspag.service.impl.PaymentServiceImpl;

public class Test {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		PaymentServiceImpl service = new PaymentServiceImpl();
		
		MerchantAuthentication auth = MerchantAuthentication.of("18121563-b71f-4f8d-baec-91a943e9fec1", "XSNUAIJWGHODXHKBGNUEZCNSBVVTCGJCUULGXXNN");
		
		Address address = new Address();
		address.setCity("ARARUNA");
		address.setState("PR");
		address.setComplement("CENTRO");
		address.setNumber("230");
		address.setCountry("BRASIL");
		address.setStreet("AV AVELINO HANEL");
		address.setZipCode("87260000");
		address.setDistrict("CENTRO");
		
		Customer customer = new Customer("EDSON MARTINS");
		customer.setAddress(address);
		customer.setIdentityType("CPNJ");
		customer.setIdentity("76295344000137");
		customer.setEmail("edson.martins@relevantsolutions.com.br");
		
		BigDecimal decimal = new BigDecimal("100.85");
		
		BoletoPayment payment = new BoletoPayment();
		payment.setAmount(decimal.movePointRight(2).longValueExact());
		payment.setBoletoNumber("2017091101");
		payment.setAssignor("Empresa Teste");
		payment.setDemostrative("Desmonstrative Teste");
		payment.setExpirationDate("2020-09-10");
		payment.setIdentification("76295344000137");
		payment.setInstructions("Aceitar somente até a data de vencimento.");	
		payment.setProvider(ProviderType.Simulado);
		
		
		Sale sale = Sale.of("10001",customer,payment);	
		
		Sale result = service.createSale(auth, sale);
		
		System.out.println(result);
		
	}

}
