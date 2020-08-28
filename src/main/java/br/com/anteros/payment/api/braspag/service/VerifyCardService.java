package br.com.anteros.payment.api.braspag.service;

import br.com.anteros.payment.api.braspag.domain.MerchantAuthentication;
import br.com.anteros.payment.api.braspag.domain.VerifyCardRequest;
import br.com.anteros.payment.api.braspag.domain.VerifyCardResponse;
import br.com.anteros.security.spring.ActionSecured;
import br.com.anteros.security.spring.ResourceSecured;

@ResourceSecured(resourceName = "VerifyCard", description = "Verificar cartão")
public interface VerifyCardService {
	
	@ActionSecured(actionName="ACT_payment", category="Pagamento", description="Verificar um cartão de crédito")
	VerifyCardResponse verifyCard(MerchantAuthentication merchantAuthentication, VerifyCardRequest verifyCardRequest);

}
