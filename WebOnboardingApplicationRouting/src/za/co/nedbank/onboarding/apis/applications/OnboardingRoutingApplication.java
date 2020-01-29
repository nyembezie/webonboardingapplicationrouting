package za.co.nedbank.onboarding.apis.applications;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
za.co.nedbank.onboarding.apis.applications.OnboardingRoutingApplication<br>

Copyright (c) 2019 - Kabini 'MA-E' Eric (CC318142)

All rights reserved.
**/
public class OnboardingRoutingApplication extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(za.co.nedbank.onboarding.routing.apis.resources.OnboardingApplicationRouting.class);
		return classes;
	}

}
