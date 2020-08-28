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
public class PaymentSplitServiceImpl extends AbstractIntegrationService implements PaymentService {


	private RestTemplate restTemplate = new RestTemplate();
	
	@Override
	public Sale createSale(MerchantAuthentication merchantAuthentication, Sale sale) {		
        HttpEntity<Sale> saleHttpEntity =
                new HttpEntity<>(sale, getHeaders(merchantAuthentication));       
        ResponseEntity<Sale> result = restTemplate.exchange(
                getPaymentAuthorizationURL(),
                HttpMethod.POST,
                saleHttpEntity,
                Sale.class
        );
        return result.getBody();
	}

	@Override
	public CaptureResponse capture(String paymentId, MerchantAuthentication merchantAuthentication,
			CaptureRequest captureRequest) {
		HttpEntity<?> captureHttpEntity =
                new HttpEntity<>(getHeaders(merchantAuthentication));

        ResponseEntity<CaptureResponse> exchange = restTemplate.exchange(
                getPaymentAuthorizationURL()+"/"+paymentId+"/?amount={amount}&serviceTaxAmount={serviceTaxAmount}" ,
                HttpMethod.PUT,
                captureHttpEntity,
                CaptureResponse.class,
                captureRequest.getAmount(),
                captureRequest.getServiceTaxAmount()
        );

        return exchange.getBody();
	}

	@Override
	public VoidResponse Void(String paymentId, MerchantAuthentication merchantAuthentication, VoidRequest voidRequest) {
		HttpEntity<?> voidHttpEntity =
                new HttpEntity<>(getHeaders(merchantAuthentication));

        ResponseEntity<VoidResponse> exchange = restTemplate.exchange(
                getPaymentAuthorizationURL()+"/{paymentId}/void",
                HttpMethod.PUT,
                voidHttpEntity,
                VoidResponse.class,
                paymentId,
                voidRequest.getAmount()
        );

        return exchange.getBody();
	}

	@Override
	public Sale get(String paymentId, MerchantAuthentication merchantAuthentication) {
		HttpEntity<Sale> voidHttpEntity =
                new HttpEntity<>(getHeaders(merchantAuthentication));

        ResponseEntity<Sale> exchange = restTemplate.exchange(
                getPaymentAuthorizationURL()+"/{paymentId}" ,
                HttpMethod.PUT,
                voidHttpEntity,
                Sale.class,
                paymentId
        );

        return exchange.getBody();
	}

	@Override
	public Sale createSale(MerchantAuthentication merchantAuthentication, Sale sale, Map<String, String> headers) {
		HttpEntity<Sale> voidHttpEntity =
                new HttpEntity<Sale>(getHeaders(merchantAuthentication, headers));

        ResponseEntity<Sale> exchange = restTemplate.exchange(
                getPaymentAuthorizationURL() ,
                HttpMethod.PUT,
                voidHttpEntity,
                Sale.class
        );

        return exchange.getBody();
	}

}
