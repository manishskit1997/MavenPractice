package Practice;

import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,52,5,233,532,531,210};
		int n=arr.length;
		//Arrays.sort(arr);
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

		}


		System.out.println(arr[1]);
	}

}
