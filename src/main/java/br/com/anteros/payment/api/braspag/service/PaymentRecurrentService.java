package br.com.anteros.payment.api.braspag.service;

import org.joda.time.DateTime;

import br.com.anteros.payment.api.braspag.domain.Customer;
import br.com.anteros.payment.api.braspag.domain.MerchantAuthentication;
import br.com.anteros.payment.api.braspag.domain.Payment;
import br.com.anteros.payment.api.braspag.domain.PaymentCredentials;
import br.com.anteros.payment.api.braspag.domain.RecurrentQuery;
import br.com.anteros.security.spring.ActionSecured;
import br.com.anteros.security.spring.ResourceSecured;


@ResourceSecured(resourceName = "PagadorRecurrent", description = "Pagamento recorrente")
public interface PaymentRecurrentService {
	
	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Atualizar dados do cliente")
	void updateCustomerData(String recurrentId, MerchantAuthentication merchantAuthentication,Customer customer);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Atualizar data final do pagamento recorrente")
	void updateRecurrentPaymentEndDate(String recurrentId, MerchantAuthentication merchantAuthentication,DateTime endDate);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Atualizar intervalo do pagamento recorrente")
	void updateRecurrentPaymentInterval(String recurrentId, MerchantAuthentication merchantAuthentication,int interval);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Atualizar dia do pagamento recorrente")
	void updateRecurrentPaymentRecurrencyDay(String recurrentId,MerchantAuthentication merchantAuthentication, byte day);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Reativar pagamento recorrente")
	void reactivateRecurrentPayment(String recurrentId, MerchantAuthentication merchantAuthentication);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Desativar pagamento recorrente")
	void deactivateRecurrentPayment(String recurrentId, MerchantAuthentication merchantAuthentication);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Atualizar parcelas do pagamento recorrente")
	void updateRecurrentPaymentInstallments(String recurrentId,MerchantAuthentication merchantAuthentication, byte installments);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Atualizar próxima data do pagamento recorrente")
	void updateRecurrentPaymentNextPaymentDate(String recurrentId,MerchantAuthentication merchantAuthentication, DateTime nextPaymentDate);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Atualizar pagamento recorrente")
	void updateRecurrentPayment(String recurrentId, MerchantAuthentication merchantAuthentication,Payment updatedPayment);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Atualizar montante(quantidade) de pagamento recorrente")
	void updateRecurrentAmount(String recurrentId, MerchantAuthentication merchantAuthentication,long amount);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Atualizar afiliação do pagamento recorrente")
	void updateRecurrentAffiliation(String recurrentId, MerchantAuthentication merchantAuthentication,PaymentCredentials affiliation);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Consulta pagamento recorrente")
    RecurrentQuery get(String recurrentId, MerchantAuthentication merchantAuthentication);

}
