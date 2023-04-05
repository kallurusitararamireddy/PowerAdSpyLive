package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.YoutubePage;

public class Verify_Youtube_LanderProperties_MarketingPlatform extends TestBase {

	@Test
	public void verify_LanderProperties() throws InterruptedException {
		YoutubePage landerProperties=new YoutubePage(getDriver());
		landerProperties.Verify_LanderProperties_EcommercePlatform();
		landerProperties.MarketingPlatform();
		
	}
}
