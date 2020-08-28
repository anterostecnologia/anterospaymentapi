package br.com.anteros.payment.api.braspag.resource;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.payment.api.braspag.domain.Customer;
import br.com.anteros.payment.api.braspag.domain.MerchantAuthentication;
import br.com.anteros.payment.api.braspag.domain.Payment;
import br.com.anteros.payment.api.braspag.domain.PaymentCredentials;
import br.com.anteros.payment.api.braspag.domain.RecurrentQuery;
import br.com.anteros.payment.api.braspag.service.PaymentRecurrentService;


@RestController
@RequestMapping(value = "/paymentRecurrent")
public class PaymentRecurrentResource {
	
	@Autowired
	@Lazy
	private PaymentRecurrentService paymentRecurrentService;
	
	
	public void updateCustomerData(String recurrentId, MerchantAuthentication merchantAuthentication,
			Customer customer) {
		paymentRecurrentService.updateCustomerData(recurrentId, merchantAuthentication, customer);
	}

	
	public void updateRecurrentPaymentEndDate(String recurrentId, MerchantAuthentication merchantAuthentication,
			DateTime endDate) {
		paymentRecurrentService.updateRecurrentPaymentEndDate(recurrentId, merchantAuthentication, endDate);
	}

	
	public void updateRecurrentPaymentInterval(String recurrentId, MerchantAuthentication merchantAuthentication,
			int interval) {
		paymentRecurrentService.updateRecurrentPaymentInterval(recurrentId, merchantAuthentication, interval);
	}

	
	public void updateRecurrentPaymentRecurrencyDay(String recurrentId, MerchantAuthentication merchantAuthentication,
			byte day) {
		paymentRecurrentService.updateRecurrentPaymentRecurrencyDay(recurrentId, merchantAuthentication, day);
	}

	
	public void reactivateRecurrentPayment(String recurrentId, MerchantAuthentication merchantAuthentication) {
		paymentRecurrentService.reactivateRecurrentPayment(recurrentId, merchantAuthentication);	
	}

	
	public void deactivateRecurrentPayment(String recurrentId, MerchantAuthentication merchantAuthentication) {
		paymentRecurrentService.deactivateRecurrentPayment(recurrentId, merchantAuthentication);
	}

	
	public void updateRecurrentPaymentInstallments(String recurrentId, MerchantAuthentication merchantAuthentication,
			byte installments) {
		paymentRecurrentService.updateRecurrentPaymentInstallments(recurrentId, merchantAuthentication, installments);
	}

	
	public void updateRecurrentPaymentNextPaymentDate(String recurrentId, MerchantAuthentication merchantAuthentication,
			DateTime nextPaymentDate) {
		paymentRecurrentService.updateRecurrentPaymentNextPaymentDate(recurrentId, merchantAuthentication, nextPaymentDate);
	}

	
	public void updateRecurrentPayment(String recurrentId, MerchantAuthentication merchantAuthentication,
			Payment updatedPayment) {
		paymentRecurrentService.updateRecurrentPayment(recurrentId, merchantAuthentication, updatedPayment);
	}

	
	public void updateRecurrentAmount(String recurrentId, MerchantAuthentication merchantAuthentication, long amount) {
		paymentRecurrentService.updateRecurrentAmount(recurrentId, merchantAuthentication, amount);
	}

	
	public void updateRecurrentAffiliation(String recurrentId, MerchantAuthentication merchantAuthentication,
			PaymentCredentials affiliation) {
		paymentRecurrentService.updateRecurrentAffiliation(recurrentId, merchantAuthentication, affiliation);
	}

	
	public RecurrentQuery get(String recurrentId, MerchantAuthentication merchantAuthentication) {
		return paymentRecurrentService.get(recurrentId, merchantAuthentication);
	}

}
