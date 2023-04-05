package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.Facebook_Pages;


public class Verify_Facebook_Domain_Registration_Date_TestScript extends TestBase
{
	@Test
	public void Facebook_Domain_Registration_Date_TestScript() throws Exception
	{
		Facebook_Pages DomainRegDV=new Facebook_Pages(getDriver());
		DomainRegDV.FacebookPageDomainRegistrationDate();
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
