package Oops;

public class Multipleinter {

	public static void main(String[] args) {
		A3 a=new A3();
		a.A1();
		a.A2();
		B3 b=a;// up-casting
		b.A1();
		//b.A2();   because of no is a relationship btw B3 and C class 
		C c=a;// up-casting
		c.A2();
		//c.A();   ,,              ,,             ,,,
	}

}
interface B3{
	void A1();
}
interface C{
	void A2();
}
class A3 implements B3,C{
	public void A1() {
		System.out.println("1st method ");
	}
	public void A2() {
		System.out.println("2nd method");
	}
}