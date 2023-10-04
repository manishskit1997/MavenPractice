package info.colectionsConcept;

import java.util.HashSet;

public class HashsetConcept {
	
	public static void main(String[] args) {
		
		HashSet s1=new HashSet();
		s1.add("dsjsdf");
		s1.add(37637);
		s1.add(null);
		s1.add(373.33);
		s1.add(null);
		s1.add('A');
		s1.add(null);
		
		for(Object o1:s1)
		{
			System.out.println(o1);
		}
	}

}
