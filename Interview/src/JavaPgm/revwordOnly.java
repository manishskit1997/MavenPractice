package JavaPgm;

import java.util.HashSet;
import java.util.Set;

public class revwordOnly {
	public static void main(String[] args)
	{
		int ch[]= {4,4,2,3,2,3,1,2,3,6,7,2,4,3,7};
		Set dupl=new HashSet();
		Set temp=new HashSet();
		for(int i=0;i<ch.length;i++)
		{
			if(!temp.contains(ch[i]))
			{
				temp.add(ch[i]);
			}
			else
			{
				dupl.add(ch[i]);
			}
			
		}
		System.out.println(dupl);
	}
}
