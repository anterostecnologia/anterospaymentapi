package br.com.anteros.payment.api.braspag.service;

import java.util.Map;

import br.com.anteros.payment.api.braspag.domain.CaptureRequest;
import br.com.anteros.payment.api.braspag.domain.CaptureResponse;
import br.com.anteros.payment.api.braspag.domain.MerchantAuthentication;
import br.com.anteros.payment.api.braspag.domain.Sale;
import br.com.anteros.payment.api.braspag.domain.VoidRequest;
import br.com.anteros.payment.api.braspag.domain.VoidResponse;
import br.com.anteros.security.spring.ActionSecured;
import br.com.anteros.security.spring.ResourceSecured;

@ResourceSecured(resourceName = "Pagador", description = "Pagamento")
public interface PaymentService {
	
	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Criar uma venda")
	Sale createSale(MerchantAuthentication merchantAuthentication, Sale sale);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Capturar")
    CaptureResponse capture(String paymentId, MerchantAuthentication merchantAuthentication, CaptureRequest captureRequest);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Void")
    VoidResponse Void(String paymentId, MerchantAuthentication merchantAuthentication, VoidRequest voidRequest);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Obter uma venda")
    Sale get(String paymentId, MerchantAuthentication merchantAuthentication);

	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Criar uma venda")
    Sale createSale(MerchantAuthentication merchantAuthentication, Sale sale, Map<String, String> headers);

}
