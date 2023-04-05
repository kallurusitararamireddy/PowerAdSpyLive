package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;

public class Verify_Instagram_filters_Language extends TestBase{

	@Test
	public void verify_Country() throws InterruptedException {
		
		InstagramPage language=new InstagramPage(TestBase.getDriver());
		language.verify_language();
	}
}
