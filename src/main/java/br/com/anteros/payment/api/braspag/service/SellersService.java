package br.com.anteros.payment.api.braspag.service;

import br.com.anteros.payment.api.braspag.domain.subordinate.Subordinate;
import br.com.anteros.security.spring.ActionSecured;
import br.com.anteros.security.spring.ResourceSecured;

@ResourceSecured(resourceName = "Sellers", description = "Subordinados")
public interface SellersService {

	@ActionSecured(actionName = "ACT_sellers", category = "Subordinados", description = "Criar um subordinado")
	Subordinate createSubordinate(Subordinate subordinate);

	@ActionSecured(actionName = "ACT_sellers", category = "Subordinados", description = "Consultar um subordinado")
	Subordinate get(String subordinateMerchantId);

}
