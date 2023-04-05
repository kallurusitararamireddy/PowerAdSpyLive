package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.YoutubePage;

public class Verify_Youtube_Dashboard_AddSeenBetween extends TestBase {

	@Test
	public void verify_adseenBetween() throws InterruptedException {
		YoutubePage youtube=new YoutubePage(getDriver());
		youtube.verify_Youtube_dashboard_addSeenBetween();
	}
}
