import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a= new ArrayList();
		a.add(10);
		a.add("true");
		a.add("Ram");
		a.add(10);
		System.out.println(a);
		ArrayList a1=new ArrayList();
		System.out.println(a1.isEmpty());
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		a1.add(1, 40);
		a1.addAll(a);
		System.out.println(a1) ;
		}

}