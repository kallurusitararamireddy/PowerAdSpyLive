package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.QuoraPage;

public class Verify_Quora_filters_Language extends TestBase{

	@Test
	public void verify_Country() throws InterruptedException {
		
		QuoraPage quora=new QuoraPage(getDriver());
		quora.verify_language();
	}
}
