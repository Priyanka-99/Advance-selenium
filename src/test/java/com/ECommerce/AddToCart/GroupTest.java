package com.ECommerce.AddToCart;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupTest {
	
	@BeforeMethod(alwaysRun=true)
	public void login() {
		Reporter.log("Login", true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logout() {
		Reporter.log("Logout", true);
	}
	
	@Test(groups="createCust")
	public void createCustomer() {
		Reporter.log("Customer created", true);
	}
	
	@Test(groups="createProj")
	public void createProject() {
		Reporter.log("Project Created", true);
	}
}


