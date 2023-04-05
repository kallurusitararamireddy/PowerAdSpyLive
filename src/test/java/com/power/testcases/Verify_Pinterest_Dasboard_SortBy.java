package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.PinterestPage;

public class Verify_Pinterest_Dasboard_SortBy extends TestBase{

	@Test
	public void verify_sortBy() throws InterruptedException {

		PinterestPage pinterest=new PinterestPage(getDriver());
		pinterest.verify_Pinterest_Dasboard_SortBy();
	}
}
