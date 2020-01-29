package za.co.nedbank.onboarding.routing.dto;

/**
za.co.nedbank.onboarding.routing.dto.ApplicationContextList<br>

Copyright (c) 2019 - Kabini 'MA-E' Eric (CC318142)

All rights reserved.
**/
public class ApplicationContextList {

	public String contextType;
	public String contextValue;

	public ApplicationContextList() {
		super();
	}

	public String getContextType() {
		return contextType;
	}

	public void setContextType(String contextType) {
		this.contextType = contextType;
	}

	public String getContextValue() {
		return contextValue;
	}

	public void setContextValue(String contextValue) {
		this.contextValue = contextValue;
	}

}