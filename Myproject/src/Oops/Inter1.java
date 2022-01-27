package Oops;

public class Inter1 {

	public static void main(String[] args) {
		B b1=new B();
		A a1=b1;
	}
}
interface A{
	public void Add();
}
class B implements A{
	void B1() {
		System.out.println("1st method");
	}
	public void Add() {
		System.out.println("2nd method");
	}
}
 