package JavaPgm;



public class CharactAndDigit {

	public static void main(String[] args) {


		String s1="Manish1234Kumar78854555444";
		String s2=s1.toLowerCase();
		char ch[]=s2.toCharArray();
		String ch1="";
		String digit="";

		for(int i=0;i<ch.length;i++) {

					if(Character.isDigit(ch[i]))
					{
						digit=digit+ch[i];
					}
					else if(Character.isAlphabetic(ch[i]))
					{
						ch1=ch1+ch[i];
					}
		
				}
				System.out.println(ch1+""+digit);
	}

}
