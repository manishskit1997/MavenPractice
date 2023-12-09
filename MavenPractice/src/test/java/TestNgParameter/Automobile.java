package TestNgParameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Automobile {
	
	@Test
	@Parameters({"Automobiles"})
	public void test2(String name) {
		System.out.println(name);
	}

}
