package JavaPgm;

public class RotateRow {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		int n=2;
		for(int i=0;i<a.length;i++) {
			System.out.print(" " +a[i]);
		}
		for(int i=0;i<n;i++) {
			
			int last=a[a.length-1];
			int j;
			for(j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(" "+a[i]);
		}
	}
	

}
