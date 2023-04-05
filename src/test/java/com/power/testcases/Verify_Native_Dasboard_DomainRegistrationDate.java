package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.NativePage;

public class Verify_Native_Dasboard_DomainRegistrationDate extends TestBase {

	@Test
	public void verify_domainRegistrationDate() throws InterruptedException {
		
		NativePage nativePage = new NativePage(getDriver());
		nativePage.verify_Native_Dasboard_DomainRegistrationDate();
	}
}
