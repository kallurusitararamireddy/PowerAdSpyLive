package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.YoutubePage;

public class Verify_Youtube_LanderProperties_AffiliateNetwork extends TestBase {

	@Test
	public void verify_LanderProperties() throws Exception {
		YoutubePage landerProperties=new YoutubePage(getDriver());
		landerProperties.YoutubeInPagelanderProperties();
		landerProperties.AffiliateNetwork();
		
	}
}
