package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.NativePage;

public class Verify_Native_LanderProperties_EcommercePlatform extends TestBase {

	@Test
	public void verify_LanderProperties() throws InterruptedException {
		NativePage ecommerce=new NativePage(getDriver());
		ecommerce.Verify_LanderProperties_EcommercePlatform();
		ecommerce.EcommercePlatform();
		
	}
}
