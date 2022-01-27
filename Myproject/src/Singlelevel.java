
public class Singlelevel {

	public static void main(String[] args) {
	   CD b1= new CD();
	   b1.Add1();
	   b1.Add();
	   System.out.println(b1.i);
	   System.out.println(b1.j);
	   AB a1= new AB();
	   a1.Add();
	   System.out.println(a1.i);
	}

}
class AB{
	int i;
	public void Add() {
		System.out.println("Parent class");
	}
}
class CD extends AB{
	int j;
	public void Add1() {
		System.out.println("sub class");
	}
}
 