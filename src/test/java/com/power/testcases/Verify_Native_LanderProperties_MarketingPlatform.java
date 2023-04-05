package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.NativePage;

public class Verify_Native_LanderProperties_MarketingPlatform extends TestBase {

	@Test
	public void verify_LanderProperties() throws InterruptedException {
		NativePage marketing=new NativePage(getDriver());
		marketing.Verify_LanderProperties_EcommercePlatform();
		marketing.MarketingPlatform();
		
	}
}
