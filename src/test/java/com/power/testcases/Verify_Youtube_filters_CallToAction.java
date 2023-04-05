package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;
import com.power.qa.pages.YoutubePage;

public class Verify_Youtube_filters_CallToAction extends TestBase{

	@Test
	public void verify_CallToAction() throws InterruptedException {
		
		YoutubePage youtube=new YoutubePage(getDriver());
		youtube.verify_filters_CallToAction();
	}
}
