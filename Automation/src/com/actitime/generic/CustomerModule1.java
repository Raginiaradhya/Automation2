package com.actitime.generic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule1 {
	@Test
	public void CreateCustomer() throws InterruptedException
	{
		Reporter.log("createCustomer", true);
		Thread.sleep(2000);
		Assert.fail();
	}
	

}
