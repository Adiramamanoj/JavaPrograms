// using super class statement inheritance prgm
public class Constrchain {

	public static void main(String[] args) {
		B C= new B(10);
		B D= new B(10,20);
	}
}
class A{
	A(int a){
		System.out.println("1st constructor");
	}
	A(int a, int b){
		System.out.println("2nd constructor");
	}
}
class B extends A{
	B(int a){
		super(10,20);
		System.out.println("3rd constructor");
	}
	B(int a, int b){
		super(10);
		System.out.println("4st constructor");
	}
}
 