import java.util.*;
public class Setinter2 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(20);
		t.add(3);
		t.add(7);
		t.add(1);
		System.out.println(t);
		Iterator i=t.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
