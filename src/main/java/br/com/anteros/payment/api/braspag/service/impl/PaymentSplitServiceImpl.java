package br.com.anteros.payment.api.braspag.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.stereotype.Service;

import br.com.anteros.payment.api.braspag.domain.Sale;
import br.com.anteros.payment.api.braspag.domain.payments.LockPayment;
import br.com.anteros.payment.api.braspag.service.AbstractIntegrationService;
import br.com.anteros.payment.api.braspag.service.PaymentSplitService;
import br.com.anteros.payment.api.common.AnterosOAuth2RestTemplate;

@Service("paymentSplitService")
@Scope("prototype")
public class PaymentSplitServiceImpl extends AbstractIntegrationService implements PaymentSplitService {

	public static final String SETTLEMENTS = "/settlements";
	public static final String API_TRANSACTIONS = "/api/transactions/";
	public static final String AUTHORIZATION = "authorization";
	public static final String BEARER = "Bearer ";
	@Autowired
	@Lazy
	private AnterosOAuth2RestTemplate restTemplateBraspag;

	@Override
	public Sale createSale(Sale sale) {				
		String url = AbstractIntegrationService.getApiCieloEcommerce(restTemplateBraspag.getTpEnviromment())+"/1/sales/";		
		OAuth2AccessToken accessToken = restTemplateBraspag.getAccessToken();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set(AUTHORIZATION, BEARER + accessToken.getValue());		
		HttpEntity<Sale> saleHttpEntity = new HttpEntity<>(sale, headers);
		ResponseEntity<Sale> result = restTemplateBraspag.exchange(url, HttpMethod.POST,
				saleHttpEntity, Sale.class);
		return result.getBody();
	}

	@Override
	public void lockPayment(String paymentId, String subordinateMerchantId) {
		String url = AbstractIntegrationService.getApiSplit(restTemplateBraspag.getTpEnviromment())+API_TRANSACTIONS+paymentId+SETTLEMENTS;		
		OAuth2AccessToken accessToken = restTemplateBraspag.getAccessToken();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set(AUTHORIZATION, BEARER + accessToken.getValue());			
		LockPayment lockPayment = new LockPayment();
		lockPayment.setSubordinateMerchantId(subordinateMerchantId);
		lockPayment.setLocked(true);		
		HttpEntity<LockPayment> saleHttpEntity = new HttpEntity<>(lockPayment, headers);
		restTemplateBraspag.exchange(url, HttpMethod.PUT,
				saleHttpEntity, Void.class);	
	}

	@Override
	public void unlockPayment(String paymentId, String subordinateMerchantId) {
		String url = AbstractIntegrationService.getApiSplit(restTemplateBraspag.getTpEnviromment())+API_TRANSACTIONS+paymentId+SETTLEMENTS;		
		OAuth2AccessToken accessToken = restTemplateBraspag.getAccessToken();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set(AUTHORIZATION, BEARER + accessToken.getValue());			
		LockPayment lockPayment = new LockPayment();
		lockPayment.setSubordinateMerchantId(subordinateMerchantId);
		lockPayment.setLocked(false);
		
		HttpEntity<LockPayment> saleHttpEntity = new HttpEntity<>(lockPayment, headers);
		restTemplateBraspag.exchange(url, HttpMethod.PUT,
				saleHttpEntity, Void.class);
	}

	@Override
	public Sale get(String paymentId) {
		String url = AbstractIntegrationService.getApiCieloECommerceSearch(restTemplateBraspag.getTpEnviromment())+"/1/sales/"+paymentId;		
		OAuth2AccessToken accessToken = restTemplateBraspag.getAccessToken();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set(AUTHORIZATION, BEARER + accessToken.getValue());		
		HttpEntity<Sale> saleHttpEntity = new HttpEntity<>(headers);
		ResponseEntity<Sale> result = restTemplateBraspag.exchange(url, HttpMethod.GET,
				saleHttpEntity, Sale.class);
		return result.getBody();
	}



}
