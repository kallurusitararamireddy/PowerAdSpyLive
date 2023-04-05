package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;

public class Verify_Instagram_filters_Country extends TestBase{

	@Test
	public void verify_Country() throws InterruptedException {
		
		InstagramPage country=new InstagramPage(TestBase.getDriver());
		country.verify_filters_Countrty();
	}
}
