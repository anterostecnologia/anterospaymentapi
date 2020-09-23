package br.com.anteros.payment.api.braspag.service.impl;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.anteros.payment.api.braspag.domain.CaptureRequest;
import br.com.anteros.payment.api.braspag.domain.CaptureResponse;
import br.com.anteros.payment.api.braspag.domain.MerchantAuthentication;
import br.com.anteros.payment.api.braspag.domain.Sale;
import br.com.anteros.payment.api.braspag.domain.VoidRequest;
import br.com.anteros.payment.api.braspag.domain.VoidResponse;
import br.com.anteros.payment.api.braspag.service.AbstractIntegrationService;
import br.com.anteros.payment.api.braspag.service.PaymentService;


@Service("paymentService")
@Scope("prototype")
public class PaymentServiceImpl extends AbstractIntegrationService implements PaymentService {

	@Override
	public Sale createSale(MerchantAuthentication merchantAuthentication, Sale sale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CaptureResponse capture(String paymentId, MerchantAuthentication merchantAuthentication,
			CaptureRequest captureRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VoidResponse Void(String paymentId, MerchantAuthentication merchantAuthentication, VoidRequest voidRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sale get(String paymentId, MerchantAuthentication merchantAuthentication) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sale createSale(MerchantAuthentication merchantAuthentication, Sale sale, Map<String, String> headers) {
		// TODO Auto-generated method stub
		return null;
	}



}
