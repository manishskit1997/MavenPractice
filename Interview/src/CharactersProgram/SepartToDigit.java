package CharactersProgram;

public class SepartToDigit {
	public static void main(String[] args) {
		
	String s="You got 500 serach result";
	String x="";
	for(int i=0;i<s.length();i++)
	{
		char s1=s.charAt(i);
		
		if(Character.isDigit(s1))
		{
			x=x+s1;
		}
	}
	//int v=Integer.parseInt(x)+100;
	int v=Integer.valueOf(x)+100;
	System.out.println(v);
	}
}
