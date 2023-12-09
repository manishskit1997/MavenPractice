package JavaPgm;

public class reversePalindrom {

	public static void main(String[] args)
	{
		String s="Good";
		String rev="";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			rev=ch[i]+rev;
		}

		if(s.equals(rev))
		{
			System.out.println("its palindrome"+rev);
		}
		else
		{
			System.out.println("its not palindrome"+rev);
		}

	}

}
