package list;

import java.util.Iterator;
import java.util.Vector;



public class ListExample {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		v.add("bAyush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		  
		 Iterator<String> itr = v.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		//System.out.println(v);
	}

}
