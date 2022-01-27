package Oops;

import java.util.ArrayList;

public class ArrayListProgm {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Adi");
		a.add("Rama");
		a.add("Rohit");
		a.add("Manoj");
		for(Object i:a) {
		    String s=(String)i;
		    if(s.charAt(0)=='a') {
		    	System.out.println(s);
		    }
		}
	}

}
