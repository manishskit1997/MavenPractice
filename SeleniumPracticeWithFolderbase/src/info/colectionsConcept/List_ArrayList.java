package info.colectionsConcept;

import java.util.ArrayList;

public class List_ArrayList {
	
	
	ArrayList  arratlist(Object value)
     {
    	 ArrayList list=new ArrayList();
 		list.add(value);
 		
 		return list;
     }
	
	public static void main(String[] args) {
		
		List_ArrayList l=new List_ArrayList();
		ArrayList value1 = l.arratlist(676767.6767);
	
		System.out.println(value1);
		
		
	}
	
	

}
