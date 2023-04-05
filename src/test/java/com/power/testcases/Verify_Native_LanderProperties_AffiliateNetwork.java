package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.NativePage;

public class Verify_Native_LanderProperties_AffiliateNetwork extends TestBase {

	@Test
	public void verify_LanderProperties() throws Exception {
		NativePage marketing=new NativePage(getDriver());
		marketing.NativeInPagelanderProperties();
		marketing.AffiliateNetwork();
		
	}
}
