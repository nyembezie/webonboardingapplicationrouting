package za.co.nedbank.onboarding.routing.dto;

/**
za.co.nedbank.onboarding.routing.dto.ProductAccessRequest<br>

Copyright (c) 2019 - Kabini 'MA-E' Eric (CC318142)

All rights reserved.
**/
public class ProductAccessRequest {

	ApplicationContexts applicationContexts;

	public ProductAccessRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplicationContexts getApplicationContexts() {
		return applicationContexts;
	}

	public void setApplicationContexts(ApplicationContexts applicationContexts) {
		this.applicationContexts = applicationContexts;
	}

	@Override
	public String toString() {
		return "ProductAccessRequest [applicationContexts=" + applicationContexts + "]";
	}
	
	

}