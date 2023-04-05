package com.power.testcases;

/**
 * 
 * @author Jithendra
 *
 */

import org.testng.annotations.Test;
import com.power.qa.base.TestBase;
import com.power.qa.pages.YoutubePage;


public class Verify_Youtube_InviteFriends_YoutubeTutorials_Twitter_BookDemo2 extends TestBase{

	@Test
	public void Instagram_Functionality_Of_RightSide_Icon_TestScript() throws Exception
	{
		YoutubePage rightsideicon= new YoutubePage(getDriver());
		rightsideicon.youtube();
		rightsideicon.CreateRequest();
		rightsideicon.InvitedFirend();
		rightsideicon.Youtube();
		rightsideicon.Twitter();
		rightsideicon.BookDemo();

	}
}


