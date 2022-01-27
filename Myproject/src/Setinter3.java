import java.util.LinkedHashSet;

// for Linked hashset
public class Setinter3 {

	public static void main(String[] args) {
		LinkedHashSet h=new LinkedHashSet();
		h.add(10);
		h.add(20);
		h.add("Hello");
		h.add(10);
		System.out.println(h.size());
		System.out.println(h);
		for(Object i:h) {
			System.out.println(i);
		}
	}

}   
 