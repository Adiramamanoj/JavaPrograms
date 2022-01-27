package Oops;

abstract class Abstr3 {
    void Add() {
    	System.out.println("1st method ");
    }
    void A() {
    	System.out.println("2nd method");
    }
    abstract void A2();
}
 abstract class Abstr4 extends Abstr3{
	void Abstr4() {
		System.out.println("sub class method");
	}
}
 class Abstr5 extends Abstr3{
	 void A2() {
		 System.out.println("super class method");
	 }
 }
class Abstr2{
	public static void main(String[] args) { 
		Abstr5 ab=new Abstr5();
		ab.A();
		ab.A2();
		ab.Add();
		Abstr3 ab1=ab;// upcasting
		ab1.A2();
	}
}

