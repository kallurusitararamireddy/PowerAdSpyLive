package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.QuoraPage;

public class Verify_Quora_LanderProperties_AffiliateNetwork extends TestBase {

	@Test
	public void verify_LanderProperties() throws Exception {
		QuoraPage quora=new QuoraPage(getDriver());
		quora.QuoraInPagelanderProperties();
		quora.AffiliateNetwork();
		
	}
}
