package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.PinterestPage;
import com.power.qa.pages.QuoraPage;

public class Verify_Pinterest_Dasboard_PostDateBetween extends TestBase{

	@Test
	public void verify_postdateBetween() throws InterruptedException {
		
		PinterestPage pinterest=new PinterestPage(getDriver());
		pinterest.verify_Pinterest_Dasboard_PostDateBetween();
		
	}
}
