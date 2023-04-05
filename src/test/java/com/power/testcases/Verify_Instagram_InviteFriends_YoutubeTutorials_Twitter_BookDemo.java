package com.power.testcases;

/**
 * 
 * @author Surya
 *
 */

import org.testng.annotations.Test;
import com.power.qa.base.TestBase;
import com.power.qa.pages.InstagramPage;


public class Verify_Instagram_InviteFriends_YoutubeTutorials_Twitter_BookDemo extends TestBase{

	@Test
	public void Instagram_Functionality_Of_RightSide_Icon_TestScript() throws Exception
	{
		InstagramPage rightsideicon= new InstagramPage(getDriver());
		rightsideicon.Instagram();
		rightsideicon.InvitedFirend();
		rightsideicon.Youtube();
		rightsideicon.Twitter();
		rightsideicon.BookDemo();

	}
}


