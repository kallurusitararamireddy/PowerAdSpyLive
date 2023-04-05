package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.NativePage;

public class Verify_Native_filters_Language extends TestBase{

	@Test
	public void verify_Country() throws InterruptedException {
		
		NativePage language=new NativePage(getDriver());
		language.verify_language();
	}
}
