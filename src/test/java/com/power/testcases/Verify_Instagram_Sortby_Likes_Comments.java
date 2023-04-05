package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;

public class Verify_Instagram_Sortby_Likes_Comments extends TestBase {

	@Test
	public void verify_likes_comments() throws InterruptedException {
		
		InstagramPage instagram=new InstagramPage(TestBase.getDriver());
		instagram.verify_sortby_likes_comments();
		
	}
}
