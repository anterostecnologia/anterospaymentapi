package br.com.anteros.payment.api.braspag.service;

import java.util.Map;

import br.com.anteros.payment.api.braspag.domain.CaptureRequest;
import br.com.anteros.payment.api.braspag.domain.CaptureResponse;
import br.com.anteros.payment.api.braspag.domain.Sale;
import br.com.anteros.payment.api.braspag.domain.VoidRequest;
import br.com.anteros.payment.api.braspag.domain.VoidResponse;
import br.com.anteros.security.spring.ActionSecured;
import br.com.anteros.security.spring.ResourceSecured;

@ResourceSecured(resourceName = "PalymentSplit", description = "Pagamento com divisão de valor")
public interface PaymentSplitService {
	
	@ActionSecured(actionName="ACT_paymentSplit", category="Pagamento", description="Criar uma venda")
	Sale createSale(Sale sale);

	@ActionSecured(actionName="ACT_paymentSplit", category="Pagamento", description="Capturar")
    CaptureResponse capture(String paymentId, CaptureRequest captureRequest);

	@ActionSecured(actionName="ACT_paymentSplit", category="Pagamento", description="Void")
    VoidResponse Void(String paymentId, VoidRequest voidRequest);

	@ActionSecured(actionName="ACT_paymentSplit", category="Pagamento", description="Obter uma venda")
    Sale get(String paymentId);

	@ActionSecured(actionName="ACT_paymentSplit", category="Pagamento", description="Criar uma venda")
    Sale createSale(Sale sale, Map<String, String> headers);

}
