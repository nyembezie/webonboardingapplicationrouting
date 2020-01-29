package za.co.nedbank.onboarding.routing.dto;
/**
za.co.nedbank.onboarding.routing.dto.ResultSetType<br>

Copyright (c) 2019 - Kabini 'MA-E' Eric (CC318142)

All rights reserved.
**/
public class ResultSetType {

	public String resultCode;
	public String resultDescription;

	public ResultSetType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDescription() {
		return resultDescription;
	}

	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}

	@Override
	public String toString() {
		return "ResultSetType [resultCode=" + resultCode + ", resultDescription=" + resultDescription + "]";
	}
	

}
