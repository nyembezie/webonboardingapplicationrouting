package za.co.nedbank.onboarding.routing.dto;

/**
za.co.nedbank.onboarding.routing.dto.OverideRulesList<br>

Copyright (c) 2019 - Kabini 'MA-E' Eric (CC318142)

All rights reserved.
**/
public class OverideRulesList {

	public String productID;
	public String productOverrideRule;

	public OverideRulesList() {
		super();
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductOverrideRule() {
		return productOverrideRule;
	}

	public void setProductOverrideRule(String productOverrideRule) {
		this.productOverrideRule = productOverrideRule;
	}

	@Override
	public String toString() {
		return " productID = " + productID + " productOverrideRule = " + productOverrideRule + " \n ";
	}
	
	

}
