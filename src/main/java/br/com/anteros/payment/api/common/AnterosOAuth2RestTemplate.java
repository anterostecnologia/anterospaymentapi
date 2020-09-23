package br.com.anteros.payment.api.common;

import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

public class AnterosOAuth2RestTemplate extends OAuth2RestTemplate {
	
	private TypeOfEnviromment tpEnviromment;

	public AnterosOAuth2RestTemplate(OAuth2ProtectedResourceDetails resource, OAuth2ClientContext context, TypeOfEnviromment tpEnviromment) {
		super(resource, context);
		this.tpEnviromment = tpEnviromment;
	}

	public AnterosOAuth2RestTemplate(OAuth2ProtectedResourceDetails resource, TypeOfEnviromment tpEnviromment) {
		super(resource);
		this.tpEnviromment = tpEnviromment;
	}

	public TypeOfEnviromment getTpEnviromment() {
		return tpEnviromment;
	}

	public void setTpEnviromment(TypeOfEnviromment tpEnviromment) {
		this.tpEnviromment = tpEnviromment;
	}

}
