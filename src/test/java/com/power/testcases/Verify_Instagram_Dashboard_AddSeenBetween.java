package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;

public class Verify_Instagram_Dashboard_AddSeenBetween extends TestBase {

	@Test
	public void verify_adseenBetween() throws InterruptedException {
		InstagramPage instagram=new InstagramPage(TestBase.getDriver());
		instagram.verify_instagram_dashboard_addSeenBetween();
	}
}
