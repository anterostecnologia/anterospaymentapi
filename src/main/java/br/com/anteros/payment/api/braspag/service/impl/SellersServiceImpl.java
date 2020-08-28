package br.com.anteros.payment.api.braspag.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import br.com.anteros.core.utils.Assert;
import br.com.anteros.core.utils.Password;
import br.com.anteros.payment.api.braspag.domain.subordinate.Subordinate;
import br.com.anteros.payment.api.braspag.service.AbstractIntegrationService;
import br.com.anteros.payment.api.braspag.service.SellersService;
import br.com.anteros.persistence.dsl.osql.OSQLQuery;



@Service("sellersService")
@Scope("prototype")
public class SellersServiceImpl extends AbstractIntegrationService implements SellersService {
	
	@Autowired
	@Lazy
	private OAuth2RestOperations restTemplate;

	@Override
	public Subordinate createSubordinate(Subordinate subordinate) {
		OAuth2AccessToken accessToken = restTemplate.getAccessToken();
		String url = this.getSellersApiURL();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("authorization", "Bearer " + accessToken.getValue());
		HttpEntity<Subordinate> entity = new HttpEntity<Subordinate>(subordinate,headers);
		return restTemplate.postForObject(url, entity, Subordinate.class);
	}

	@Override
	public Subordinate get(String subordinateMerchantId) {
		return null;
	}
	
	

}
