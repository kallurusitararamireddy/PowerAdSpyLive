package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;

public class Verify_Instagram_Dasboard_DomainRegistrationDate extends TestBase {

	@Test
	public void verify_domainRegistrationDate() throws InterruptedException {
		
		InstagramPage instagram=new InstagramPage(TestBase.getDriver());
		instagram.verify_Instagram_Dasboard_DomainRegistrationDate();
	}
}
