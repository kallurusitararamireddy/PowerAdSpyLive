package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;

public class Verify_Instagram_filters_CallToAction extends TestBase{

	@Test
	public void verify_CallToAction() throws InterruptedException {
		
		InstagramPage callToAction=new InstagramPage(TestBase.getDriver());
		callToAction.verify_filters_CallToAction();
	}
}
