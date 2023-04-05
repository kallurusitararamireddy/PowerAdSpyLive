package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.QuoraPage;

public class Verify_Quora_Dasboard_DomainRegistrationDate extends TestBase {

	@Test
	public void verify_domainRegistrationDate() throws InterruptedException {
		
		QuoraPage Quora=new QuoraPage(TestBase.getDriver());
		Quora.verify_Quora_Dasboard_DomainRegistrationDate();
	}
}
