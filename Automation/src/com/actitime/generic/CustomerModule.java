package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule {
	@BeforeMethod
	public void Login()
	{
		Reporter.log("login", true);
	}
	@AfterMethod
	public void Logout()
	{
		Reporter.log("logout", true);
	}
	@Test
	public void createCustomer()
	{
		Reporter.log("CreateCustomer",true);

	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer", true);
	}
	

}
