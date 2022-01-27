import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// HashMap example
public class Mapinter {

	public static void main(String[] args) {
		 HashMap h=new HashMap();
		 h.put(1, "Hello");
		 h.put(2, "Welcome");
		 h.put(3, " to my world");
		 h.put(4, "Rama");
		 System.out.println(h.size());
		 System.out.println(h);
		 Set s=h.keySet();// to extract keys
		 for(Object i:s) {
			 System.out.println("the keys are: "+ i);
		 }
		 Collection s1=h.values();// to extract values
		 for(Object i1:s1) {
			 System.out.println("Values: "+ i1);
		 }
	}

}
