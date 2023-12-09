package TestNgParameter;

import org.testng.annotations.*;


public class ParameterExample {
	

	@Test
	@Parameters({"i","j"})
	public void add(int a,int b)
	{
		System.out.println("add: "+ (a+b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void sub(int a,int b)
	{
		System.out.println("sub: "+(a-b));
	}

	
	@Test
	@Parameters({"i","j"})
	public void mul(int a,int b)
	{
		System.out.println("mul: "+(a*b));
	}

	
	@Test
	@Parameters({"i","j"})
	public void div(int a,int b)
	{
		System.out.println("div: "+(a/b));
	}


}
