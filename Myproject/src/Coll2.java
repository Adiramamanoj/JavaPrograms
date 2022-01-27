import java.util.ArrayList;
import java.util.Iterator;
// to fecth the values using loops 
public class Coll2 {

	public static void main(String[] args) {
		  ArrayList<Integer> a1=new ArrayList<>();
		  a1.add(10);
		  a1.add(20);
		  a1.add(30);
		  a1.add(40);
		  /*for(int i=0;i<a1.size();i++) {    // For loop
			  System.out.println(a1.get(i));
		  }*/
		  /*for(Object i:a1) {        // for foreach loop
			  System.out.println(i);
		  }*/
		  Iterator<Integer> i=a1.iterator();
		  while(i.hasNext()) {        // by using iterator method 
			  System.out.println(i.next());
		  }
		  }

}
