package JavaPgm;

public class NamePattern {
	public static void main(String[] args) {
		String name="Manish";
		for(int i=1;i<=name.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(name.charAt(j));
			}
			System.out.println();
		}
	}

}
