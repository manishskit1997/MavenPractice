package TestNgParameter;

import java.util.HashSet;
import java.util.Set;

public class DupicateRemoved {

	public static void main(String[] args) {
		String s="aabbccddeefghijaabb";
		System.out.println("the characters are :  "+s);
		char[] a=s.toCharArray();
		Set duplicate=new HashSet();
		Set temp=new HashSet();
		for(int i=0;i<a.length;i++)
		{
			if(!temp.contains(a[i]))
			{
				temp.add(a[i]);
			}
			else
			{
				{
					duplicate.add(a[i]);
				}
			}
		}

		System.out.println("the duplicate values are :- "+duplicate);
		System.out.println("After removed the duplicate:- "+temp);
	}

}
