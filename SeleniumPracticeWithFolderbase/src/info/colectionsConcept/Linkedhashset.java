package info.colectionsConcept;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {
	
	public static void main(String[] args){
		int s[]= {3,3,4,2,3,4,54,2,3,2};
		//Set set=new HashSet();
		//HashSet set=new HashSet();
		//HashSet set=new LinkedHashSet();
		LinkedHashSet set=new LinkedHashSet();
		set.add(null);
		set.add("kjdsksdjfks");
		set.add('A');
		set.add(7838733);
		set.add(38738.33);
		set.add('A');
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		System.out.println(set);
	}

}
