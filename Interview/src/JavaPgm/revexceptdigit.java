package JavaPgm;

public class revexceptdigit {
	public static void main(String[] args) {
		String s="Test123Good";
		s=s.toLowerCase();
		String digit=s.substring(4, 7);
		String f=s.substring(0, 4);
		String l=s.substring(7, 11);
		String fr="";
		String lr="";
		for(int i=0;i<f.length();i++)
		{
			fr=f.charAt(i)+fr;
		}
		for(int j=0;j<l.length();j++)
		{
			lr=l.charAt(j)+lr;
		}
		System.out.println(lr+""+digit+""+fr);

	}

}
