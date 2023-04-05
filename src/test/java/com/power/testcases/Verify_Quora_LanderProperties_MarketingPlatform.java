package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.QuoraPage;

public class Verify_Quora_LanderProperties_MarketingPlatform extends TestBase {

	@Test
	public void verify_LanderProperties() throws InterruptedException {
		QuoraPage quora=new QuoraPage(getDriver());
		quora.Verify_LanderProperties_EcommercePlatform();
		quora.MarketingPlatform();
		
	}
}
