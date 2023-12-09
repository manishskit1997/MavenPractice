package TestNgParameter;

import org.testng.annotations.*;

public class Software {

	@Test
	@Parameters({"softwarecompany"})
	public void test1(String name) {
		System.out.println(name);
	}
	
	
}
