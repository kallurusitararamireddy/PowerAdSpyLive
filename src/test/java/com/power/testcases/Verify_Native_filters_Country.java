package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.NativePage;

public class Verify_Native_filters_Country extends TestBase{

	@Test
	public void verify_Country() throws InterruptedException {
		
		NativePage country=new NativePage(getDriver());
		country.verify_filters_Countrty();
	}
}
