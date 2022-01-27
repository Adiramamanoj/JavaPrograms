// WAP to pass parameter in constructor and print using Inheritance // or Constructor Chaining 
package Javaprgm;
class A
{
	A(){
		System.out.println("const A");
	}
	A(int a)
	{
		System.out.println("const B");
	}
}
class B extends A
{
	B(){
		System.out.println("const C");
	}
	B(int b){
		super(10);// for passing parameters we need to put super statement extends for super class   
		System.out.println("const D");
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		B b1= new B();
		B b2= new B(10);
	}

}
