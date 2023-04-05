package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.NativePage;

public class Verify_Native_Dasboard_PostDateBetween extends TestBase{

	@Test
	public void verify_postdateBetween() throws InterruptedException {
		
		NativePage nativePage = new NativePage(getDriver());
		nativePage.verify_Native_Dasboard_PostDateBetween();	
		
	}
}
