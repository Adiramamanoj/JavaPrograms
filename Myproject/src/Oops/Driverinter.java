package Oops;

public class Driverinter {

	public static void main(String[] args) {
		C1 c=new C1();
		c.Add();
		c.Substract();
		A1 obj=c;// upcasting
		obj.Add();
		obj.Substract();
		B1.sum();// to call the class B1 we should make the method as static, so that we call by class name and method name
		
	}
}
interface A1{
	void Add();
	void Substract();
}
abstract class B1 implements A1{ 
	static void sum() {
		System.out.println("sum of no."); 
	}
}
class C1 implements A1{
	public void Add() {
		System.out.println("1st method");
	}
	public void Substract() {
		System.out.println("2nd method");
	}
}
