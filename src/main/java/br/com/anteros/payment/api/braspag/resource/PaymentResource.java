package br.com.anteros.payment.api.braspag.resource;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.anteros.payment.api.braspag.domain.CaptureRequest;
import br.com.anteros.payment.api.braspag.domain.CaptureResponse;
import br.com.anteros.payment.api.braspag.domain.MerchantAuthentication;
import br.com.anteros.payment.api.braspag.domain.Sale;
import br.com.anteros.payment.api.braspag.domain.VoidRequest;
import br.com.anteros.payment.api.braspag.domain.VoidResponse;
import br.com.anteros.payment.api.braspag.service.PaymentService;


@RestController
@RequestMapping(value = "/payment")
public class PaymentResource {
	
	@Autowired
	@Lazy
	private PaymentService paymentService;
	

	public Sale createSale(MerchantAuthentication merchantAuthentication, Sale sale) {		
		return paymentService.createSale(merchantAuthentication, sale);
	}


	public CaptureResponse capture(String paymentId, MerchantAuthentication merchantAuthentication,
			CaptureRequest captureRequest) {
		return paymentService.capture(paymentId, merchantAuthentication, captureRequest);
	}

	public VoidResponse Void(String paymentId, MerchantAuthentication merchantAuthentication, VoidRequest voidRequest) {
		return paymentService.Void(paymentId, merchantAuthentication, voidRequest);
	}

	public Sale get(String paymentId, MerchantAuthentication merchantAuthentication) {
		return paymentService.get(paymentId, merchantAuthentication);
	}

	public Sale createSale(MerchantAuthentication merchantAuthentication, Sale sale, Map<String, String> headers) {
		return paymentService.createSale(merchantAuthentication, sale, headers);
	}

}
