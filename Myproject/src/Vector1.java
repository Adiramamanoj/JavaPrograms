import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add("Hello");
		v.add(50.2);
		v.add(89);
		System.out.println(v);
		v.removeElement("Hello");  // remove the object
		System.out.println(v);
		v.removeElementAt(2);     // fetch the element present in 2nd index
		System.out.println(v);
		System.out.println(v.firstElement());  // display
		System.out.println(v.lastElement());
		v.removeElement(new Integer (89));
		System.out.println(v);
	}

}
