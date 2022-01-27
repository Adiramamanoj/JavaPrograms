package Oops;
// interface to interface 
public class Driverclass {

	public static void main(String[] args) {
	Q q=new Q();
	q.A();
	q.A2();
	Z z=q;
	z.A();
	z.A2();
	X x=q;
	x.A();
	x.A2();
	}

}
interface Z{
	void A();
	void A2();
}
interface X extends Z{
	void A();
}
class Q implements X{
	public void A() {
		System.out.println("1st method");
	}
	public void A2() {
		System.out.println("2nd method");
	}
}

