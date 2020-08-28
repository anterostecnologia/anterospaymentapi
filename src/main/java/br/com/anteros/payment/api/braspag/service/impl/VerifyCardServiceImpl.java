package br.com.anteros.payment.api.braspag.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.anteros.payment.api.braspag.domain.MerchantAuthentication;
import br.com.anteros.payment.api.braspag.domain.VerifyCardRequest;
import br.com.anteros.payment.api.braspag.domain.VerifyCardResponse;
import br.com.anteros.payment.api.braspag.service.AbstractIntegrationService;
import br.com.anteros.payment.api.braspag.service.VerifyCardService;


@Service("verifyCardService")
@Scope("prototype")
public class VerifyCardServiceImpl extends AbstractIntegrationService implements VerifyCardService {

	@Override
	public VerifyCardResponse verifyCard(MerchantAuthentication merchantAuthentication,
			VerifyCardRequest verifyCardRequest) {
		return null;
	}

}
