package br.com.anteros.payment.api.braspag.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.payment.api.braspag.domain.MerchantAuthentication;
import br.com.anteros.payment.api.braspag.domain.VerifyCardRequest;
import br.com.anteros.payment.api.braspag.domain.VerifyCardResponse;
import br.com.anteros.payment.api.braspag.service.VerifyCardService;


@RestController
@RequestMapping(value = "/verifyCard")
public class VerifyCardResource {
	
	@Autowired
	@Lazy
	private VerifyCardService verifyCardService;
	

	public VerifyCardResponse verifyCard(MerchantAuthentication merchantAuthentication,
			VerifyCardRequest verifyCardRequest) {
		return verifyCardService.verifyCard(merchantAuthentication, verifyCardRequest);
	}


}
