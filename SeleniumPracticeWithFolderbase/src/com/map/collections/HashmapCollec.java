package com.map.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapCollec {

	public static void main(String[] args) {



		//Map map=new HashMap();  
		//Map map=new LinkedHashMap(); 
//		Map map=new TreeMap(); 
//		map.put(4,'A');
//		map.put(2, 'B');
//		map.put(1, 'C'); 
//		map.put(2, 'A');
//		map.put(41, 'A');

		//Adding elements to map  
		//    map.put(1,"Amit");  
		//    map.put(5,"Rahul");  
		//    map.put(2,"Jai");  
		//    map.put(6,"Amit");  

		//System.out.println(map);
		
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  System.out.println(hm);
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		   System.out.println(m.getKey()+" "+m.getValue());

	}
}
}
