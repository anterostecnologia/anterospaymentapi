package br.com.anteros.payment.api.braspag.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.stereotype.Service;

import br.com.anteros.payment.api.braspag.domain.subordinate.Subordinate;
import br.com.anteros.payment.api.braspag.service.AbstractIntegrationService;
import br.com.anteros.payment.api.braspag.service.SellersService;
import br.com.anteros.payment.api.common.AnterosOAuth2RestTemplate;

@Service("sellersService")
@Scope("prototype")
public class SellersServiceImpl extends AbstractIntegrationService implements SellersService {
	
	public static final String API_SUBORDINATES = "/api/subordinates";
	public static final String BEARER = "Bearer ";
	public static final String AUTHORIZATION = "authorization";
	@Autowired
	@Lazy
	private AnterosOAuth2RestTemplate restTemplateBraspag;

	@Override
	public Subordinate createSubordinate(Subordinate subordinate) {
		OAuth2AccessToken accessToken = restTemplateBraspag.getAccessToken();
		String url = AbstractIntegrationService.getSellers(restTemplateBraspag.getTpEnviromment())+API_SUBORDINATES;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set(AUTHORIZATION, BEARER + accessToken.getValue());
		HttpEntity<Subordinate> entity = new HttpEntity<Subordinate>(subordinate,headers);
		return restTemplateBraspag.postForObject(url, entity, Subordinate.class);
	}

	@Override
	public Subordinate get(String subordinateMerchantId) {
		OAuth2AccessToken accessToken = restTemplateBraspag.getAccessToken();
		String url = AbstractIntegrationService.getSellers(restTemplateBraspag.getTpEnviromment())+API_SUBORDINATES+"/"+subordinateMerchantId;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set(AUTHORIZATION, BEARER + accessToken.getValue());
		HttpEntity<Subordinate> entity = new HttpEntity<Subordinate>(headers);
		return restTemplateBraspag.exchange(url, HttpMethod.GET, entity, Subordinate.class).getBody();
	}
	
	

}
