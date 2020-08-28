package br.com.anteros.payment.api.braspag.service;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import br.com.anteros.payment.api.braspag.domain.MerchantAuthentication;

public class AbstractIntegrationService {
	
    @Value("${braspag.integration.url}")
    private String braspagURL="https://apisandbox.braspag.com.br";
    
    @Value("${braspag.sellers.integration.url}")
    private String braspagSellersURL="https://splitonboardingsandbox.braspag.com.br";
    
    

    private static final String PAYMENT_AUTHORIZATION_URI = "/v2/sales";
    private static final String SELLERS_URI = "/api/subordinates";


    public HttpHeaders getHeaders(MerchantAuthentication merchantAuthentication) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("MerchantId", merchantAuthentication.getMerchantId());
        headers.set("MerchantKey", merchantAuthentication.getMerchantKey());

        return  headers;
    }
    
    public HttpHeaders getHeaders(MerchantAuthentication merchantAuthentication, Map<String,String> headers) {
        HttpHeaders result = new HttpHeaders();
        result.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        result.setContentType(MediaType.APPLICATION_JSON);
        result.set("MerchantId", merchantAuthentication.getMerchantId());
        result.set("MerchantKey", merchantAuthentication.getMerchantKey());
        
        for (String key : headers.keySet()) {
        	result.set(key,headers.get(key));
        }

        return  result;
    }

    public String getPaymentAuthorizationURL() {
        return braspagURL + PAYMENT_AUTHORIZATION_URI;
    }
    
    public String getSellersApiURL() {
        return braspagSellersURL + SELLERS_URI;
    }

}
