package com.testNgAnnotation;

import org.testng.annotations.*;

public class TestNgPractice {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class...");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class..");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}

	@Test
	public void test1() {
		System.out.println("Test1..");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method..");
	}

	@Test
	public void test2()
	{
		System.out.println("test2..");
	}

}
