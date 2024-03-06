package com.TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation
{

	@BeforeMethod
public void gmailApplicationLunch()
{
System.out.println("***************The gmail Application Successfully Lunched*************************");
}
	
@Test(priority=0)	
public void gmailLoginTest()
{
	System.out.println("The gmail Login functionality test successfully");
}
	@Test(priority=1)
	public void gmailInboxtest()
	{
		System.out.println("The gmail Inboxtest functionality test successfully");
	}
	@Test(priority=2)
	public void gmailComposetest()
	{
		System.out.println("The gmail Composetest functionality test successfully");
	}
	
@Test(enabled=false)
public void gmailDrafttest()
{
	System.out.println("The gmail Drafttest functionality test successfully");
}

@Test(priority=3)
public void gmailSendtest()
{
	System.out.println("The gmail Sendtest functionality test successfully");
}

@AfterMethod
public void gmailCloseApplication()
{
	System.out.println("*****************The gmail Close the Application test successfully******************************");
}




}