package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;

public class Verify_Instagram_LanderProperties_EcommercePlatform extends TestBase {

	@Test
	public void verify_LanderProperties() throws InterruptedException {
		InstagramPage landerProperties=new InstagramPage(getDriver());
		landerProperties.Verify_LanderProperties_EcommercePlatform();
		landerProperties.EcommercePlatform();
		
	}
}
