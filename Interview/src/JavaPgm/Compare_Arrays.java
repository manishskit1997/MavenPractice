package JavaPgm;

import java.util.HashSet;
import java.util.Set;

public class Compare_Arrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,3,5,7,9};
		int c[]= {1,3,5,9,15};
		Set array1=new HashSet();
		Set array2=new HashSet();
		Set array3=new HashSet();
		
		for(int a1:a)
		{
			array1.add(a1);
		}
		
		for(int b1:b)
		{
			array2.add(b1);
		}
		
		for(int c1:c)
		{
			array3.add(c1);
		}
		
		System.out.println(array1);
		System.out.println(array2);
		System.out.println(array3);
		array1.retainAll(array2);
		array1.retainAll(array3);
		System.out.println("the compare of output:" +array1 );

	}

}
