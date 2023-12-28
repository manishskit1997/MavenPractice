package Utils;

import java.util.Iterator;
import java.util.Set;

public class Genericutils {
	
	public PickoContainerTextContent PCTC;

	public Genericutils(PickoContainerTextContent PCTC)
	{
		this.PCTC=PCTC;
	} 
	
	public void switchTochildWindow()
	{
		Set<String> All_Win = PCTC.driver.getWindowHandles();
		Iterator<String> itr = All_Win.iterator();
		String Firsttab = itr.next();
		String SecondTab = itr.next();
		PCTC.driver.switchTo().window(SecondTab);
	}
	
	

}
