package info.colectionsConcept;

import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add("hggj");
		v.add(512);
		v.add('A');
		v.add(true);
		
		for(int i=0;i<v.size();i++) {
		System.out.println(v);
		
		}
	}

}
