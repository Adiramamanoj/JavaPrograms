import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//  by using hashset method 
public class Setinter1 {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);
		h.remove(10);// by passing values directly we can remove the element
		System.out.println(h.size());
		System.out.println(h);
		ArrayList a=new ArrayList(h);
		Collections.sort(a);
		System.out.println(a);
	}
}
 