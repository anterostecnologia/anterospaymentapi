package br.com.anteros.payment.api.braspag.service;

import br.com.anteros.payment.api.braspag.domain.Sale;
import br.com.anteros.security.spring.ActionSecured;
import br.com.anteros.security.spring.ResourceSecured;

@ResourceSecured(resourceName = "PalymentSplit", description = "Pagamento com divisão de valor")
public interface PaymentSplitService {
	
	@ActionSecured(actionName="ACT_paymentSplit", category="Pagamento", description="Criar uma venda")
	Sale createSale(Sale sale);

	@ActionSecured(actionName="ACT_paymentSplit", category="Pagamento", description="Bloquear pagamento")
    void lockPayment(String paymentId, String subordinateMerchantId);
	
	@ActionSecured(actionName="ACT_paymentSplit", category="Pagamento", description="Liberar pagamento")
    void unlockPayment(String paymentId, String subordinateMerchantId);	
	
	@ActionSecured(actionName="ACT_paymentSplit", category="Pagamento", description="Consultar uma venda")
    Sale get(String paymentId);

}
