package com.testNgAnnotation;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestngClass2 {
	
	
	//@Test(description="this is 1st one")
	
	//@Test(dependsOnMethods= {"test2","bppple"})
	
	@Test(groups="Sanity")
	public void test1() throws InterruptedException
	{
		System.out.println("test1...");
		
	}
	
	//@Test(description="this is 2nd one")
	@Test(groups="Sanity")
	public void test2()
	{
		System.out.println("test2...");
		Assert.assertTrue(true);
	}
	
	@Test(groups="regression")
	public void bppple() {
		System.out.println("its 3rd test case");
	}
	
	@Test(groups="Sanity")
	public void bpple() {
		System.out.println("its 4th test case");
	}

}
