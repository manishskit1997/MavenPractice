package TestNgParameter;

import org.testng.annotations.DataProvider;

public class DataproviderSeprateClass {
	
	@DataProvider(name="serchData")
	public Object[][] serachData()
	{
		Object[][] serachkeyword=new Object[3][2];
		
		serachkeyword[0][0]="India";
		serachkeyword[0][1]="Qutub minar";
		
		serachkeyword[1][0]="Agra";
		serachkeyword[1][1]="taj mahel";
		
		serachkeyword[2][0]="Hydrabad";
		serachkeyword[2][1]="Charminar";
		
		return serachkeyword;
	}

}
