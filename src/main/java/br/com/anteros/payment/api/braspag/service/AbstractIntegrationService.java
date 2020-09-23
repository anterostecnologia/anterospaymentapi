package br.com.anteros.payment.api.braspag.service;

import java.util.Arrays;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import br.com.anteros.payment.api.braspag.domain.MerchantAuthentication;
import br.com.anteros.payment.api.common.TypeOfEnviromment;

public class AbstractIntegrationService {
	
    //Sandbox

    //API Cielo E-Commerce: 
    public static final String sandBoxApiCieloEcommerce = "https://apisandbox.cieloecommerce.cielo.com.br";
    //API Cielo E-Commerce (Consultas): 
    public static final String sandBoxApiCieloECommerceSearch = "https://apiquerysandbox.cieloecommerce.cielo.com.br";
    //API Split: 
    public static final String sandBoxApiSplit = "https://splitsandbox.braspag.com.br";
    //Braspag OAUTH2 Server: 
    public static final String sandBoxOAuth2Server = "https://authsandbox.braspag.com.br";
    //Sellers
    public static final String sandBoxSellers = "https://splitonboardingsandbox.braspag.com.br";
    
    		
    //Produção

    //API Cielo E-Commerce: 
    public static final String productionApiCieloECommerce = "https://api.cieloecommerce.cielo.com.br";
    //API Cielo E-Commerce (Consultas): 
    public static final String productionApiCieloECommerceSearch = "https://apiquery.cieloecommerce.cielo.com.br";
    //API Split: 
    public static final String productionApiSplit = "https://split.braspag.com.br";
    //Braspag OAUTH2 Server: 
    public static final String productionOAuth2Server = "https://auth.braspag.com.br";
    //Sellers
    public static final String productionSellers = "https://splitonboarding.braspag.com.br";
    



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
    
    
    public static String getApiCieloEcommerce(TypeOfEnviromment tpEnvironment) {
    	if (tpEnvironment.equals(TypeOfEnviromment.TEST)) {
    		return sandBoxApiCieloEcommerce;
    	}
    	return productionApiCieloECommerce;
    }
    
    public static String getApiCieloECommerceSearch(TypeOfEnviromment tpEnvironment) {
    	if (tpEnvironment.equals(TypeOfEnviromment.TEST)) {
    		return sandBoxApiCieloECommerceSearch;
    	}
    	return productionApiCieloECommerceSearch;
    }
    
    public static String getApiSplit(TypeOfEnviromment tpEnvironment) {
    	if (tpEnvironment.equals(TypeOfEnviromment.TEST)) {
    		return sandBoxApiSplit;
    	}
    	return productionApiSplit;
    }
    
    public static String getOAuth2Server(TypeOfEnviromment tpEnvironment) {
    	if (tpEnvironment.equals(TypeOfEnviromment.TEST)) {
    		return sandBoxOAuth2Server;
    	}
    	return productionOAuth2Server;
    }
    
    public static String getSellers(TypeOfEnviromment tpEnvironment) {
    	if (tpEnvironment.equals(TypeOfEnviromment.TEST)) {
    		return sandBoxSellers;
    	}
    	return productionSellers;
    }    

}
