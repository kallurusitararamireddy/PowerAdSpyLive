package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;

import com.power.qa.pages.Gdn_Pages;

public class Verify_Gdn_Domain_Registration_Date_TestScript extends TestBase
{
	@Test
	public void Verify_Gdn_Domain_Registration_Date_TestScript() throws Exception
	{
		Gdn_Pages DomainRegDV=new Gdn_Pages(getDriver());
		DomainRegDV.GdnPageDomain_Registration_Date();
		DomainRegDV.DomainRegistrationDate_All();
		DomainRegDV.DomainRegistrationDate_Today();
		DomainRegDV.DomainRegistrationDate_yesterday();
		DomainRegDV.DomainRegistrationDate_Last_7_Days();
		DomainRegDV.DomainRegistrationDate_Last_Thirty_Days();
		DomainRegDV.DomainRegistrationDate_This_Month_Days();
		DomainRegDV.DomainRegistrationDate_Last_Month_Days(); 
	//	DomainRegDV.DomainRegistrationDate_Custom_Range_Days();
		
	}
}
