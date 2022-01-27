import java.util.LinkedList;

//link list example
public class Coll3 {

	public static void main(String[] args) {
	    LinkedList l=new LinkedList();
	    l.add(10);
	    l.add("Hello");
	    l.add(20.5);
	    System.out.println(l);
	    l.addFirst(2);
	    System.out.println(l);
	    l.addLast(30);
	    System.out.println(l);
	    l.add(1, 32);
	    System.out.println(l);
	    l.removeFirst();
	    System.out.println(l);
	    l.removeLast();
	    System.out.println(l);
	    System.out.println(l.getFirst());
	    System.out.println(l.getLast());
	}

}
