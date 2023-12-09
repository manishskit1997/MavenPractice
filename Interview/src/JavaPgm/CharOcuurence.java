package JavaPgm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharOcuurence {
	public static void main(String[] args) {
		String s1="Applemangop";
		s1=s1.toLowerCase();
		int count=0;
		char[] s2 = s1.toCharArray();
		Map<Character,Integer> map=new TreeMap<>();
		for(int i=0;i<s2.length;i++)
		{
			count=0;
			for(int j=0;j<s2.length;j++) {
				if(s2[i]==s2[j])
				{
					//if(s2[j]=='p') {
					count++;
					map.put(s2[j], count);
					//}
				}
			}
		}
		System.out.println(map);
	}

}
