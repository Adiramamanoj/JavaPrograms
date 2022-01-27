package Javaprgm;

public class Staticblock {
	 int a;// global variable which is non static variable
	// static int a=10;  stativ variable decleartion and intialisation.....
	static {
		//a=20; static initialiser block 
		//System.out.println(a);
		//System.out.println(a); CTE because non static variable cannot be called inside the static block
		System.out.println("Hola");
		System.out.println("hye");
	}

	public static void main(String[] args) {
		System.out.println("bye");
	}
}
