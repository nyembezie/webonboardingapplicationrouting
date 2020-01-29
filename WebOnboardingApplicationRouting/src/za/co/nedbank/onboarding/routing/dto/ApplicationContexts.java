package za.co.nedbank.onboarding.routing.dto;

import java.util.ArrayList;

/**
 * za.co.nedbank.onboarding.routing.dto.ApplicationContexts<br>
 * 
 * Copyright (c) 2019 - Kabini 'MA-E' Eric (CC318142)
 * 
 * All rights reserved.
 **/
public class ApplicationContexts {

	public ArrayList<ApplicationContextList> applicationContexts;

	public ApplicationContexts() {
		super();
		applicationContexts = new ArrayList<ApplicationContextList>();
	}

	public ArrayList<ApplicationContextList> getApplicationContexts() {
		return applicationContexts;
	}

	public void setApplicationContexts(ArrayList<ApplicationContextList> applicationContexts) {
		this.applicationContexts = applicationContexts;
	}

}
