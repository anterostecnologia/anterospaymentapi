package br.com.anteros.payment.api.braspag.service.impl;

import org.joda.time.DateTime;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.payment.api.braspag.domain.Customer;
import br.com.anteros.payment.api.braspag.domain.MerchantAuthentication;
import br.com.anteros.payment.api.braspag.domain.Payment;
import br.com.anteros.payment.api.braspag.domain.PaymentCredentials;
import br.com.anteros.payment.api.braspag.domain.RecurrentQuery;
import br.com.anteros.payment.api.braspag.service.AbstractIntegrationService;
import br.com.anteros.payment.api.braspag.service.PaymentRecurrentService;


@Service("paymentRecurrentService")
@Scope("prototype")
public class PaymentRecurrentServiceImpl extends AbstractIntegrationService implements PaymentRecurrentService {

	@Override
	public void updateCustomerData(String recurrentId, MerchantAuthentication merchantAuthentication,
			Customer customer) {
	}

	@Override
	public void updateRecurrentPaymentEndDate(String recurrentId, MerchantAuthentication merchantAuthentication,
			DateTime endDate) {

	}

	@Override
	public void updateRecurrentPaymentInterval(String recurrentId, MerchantAuthentication merchantAuthentication,
			int interval) {
		

	}

	@Override
	public void updateRecurrentPaymentRecurrencyDay(String recurrentId, MerchantAuthentication merchantAuthentication,
			byte day) {
		

	}

	@Override
	public void reactivateRecurrentPayment(String recurrentId, MerchantAuthentication merchantAuthentication) {
		

	}

	@Override
	public void deactivateRecurrentPayment(String recurrentId, MerchantAuthentication merchantAuthentication) {
		

	}

	@Override
	public void updateRecurrentPaymentInstallments(String recurrentId, MerchantAuthentication merchantAuthentication,
			byte installments) {
		

	}

	@Override
	public void updateRecurrentPaymentNextPaymentDate(String recurrentId, MerchantAuthentication merchantAuthentication,
			DateTime nextPaymentDate) {
		

	}

	@Override
	public void updateRecurrentPayment(String recurrentId, MerchantAuthentication merchantAuthentication,
			Payment updatedPayment) {
		

	}

	@Override
	public void updateRecurrentAmount(String recurrentId, MerchantAuthentication merchantAuthentication, long amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRecurrentAffiliation(String recurrentId, MerchantAuthentication merchantAuthentication,
			PaymentCredentials affiliation) {
		// TODO Auto-generated method stub

	}

	@Override
	public RecurrentQuery get(String recurrentId, MerchantAuthentication merchantAuthentication) {
		// TODO Auto-generated method stub
		return null;
	}

}
