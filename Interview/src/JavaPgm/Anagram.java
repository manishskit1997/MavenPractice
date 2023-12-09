package JavaPgm;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="Anna";
		String s2="annA";
		
		if(s1.length()!=s2.length())
		{
		System.out.println("its not a anagram");
		}
		else
		{
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("its anagram");
			}
			else
			{
				System.out.println("its not a anagram");
			}
			
			
		}
		
		
}
}
