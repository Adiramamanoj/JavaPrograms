// complie time polymorphism   as eg: method overloading

public class Ctpoly {

	public static void main(String[] args) {
		Gag g1=new Gag();
		g1.A4();
		g1.A4(10);
	}

}
class Gag{
	void A4() {
		System.out.println("1st method");
	}
	void A4(int a) {
		System.out.println("2nd method");
	}
}