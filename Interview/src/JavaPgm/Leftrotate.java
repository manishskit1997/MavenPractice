package JavaPgm;

public class Leftrotate {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		for(int i=0;i<=5;i++)
		{
			int first=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=first; 
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}

	}

}
