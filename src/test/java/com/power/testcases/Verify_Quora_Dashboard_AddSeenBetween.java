package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.QuoraPage;

public class Verify_Quora_Dashboard_AddSeenBetween extends TestBase {

	@Test
	public void verify_adseenBetween() throws InterruptedException {
		QuoraPage quora=new QuoraPage(getDriver());
		quora.verify_Quora_dashboard_addSeenBetween();
	}
}
