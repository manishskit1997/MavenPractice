package JavaPgm;

import java.util.Arrays;

public class SecondMax {
	public static void main(String[] args) {
		int a[]= {3,8,7,5,1};
		int n = a.length-1;
		//Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		System.out.println(a[n-2]);
	}
}
