// WAP to print two class using static method to static method
package Javaprgm;
class C
{
	static int a;
	static int b;
	static int c;
	public void Add(int a, int b, int c)
	{
		int sum=0;
	    sum=a+b+c;
	    System.out.println(sum);
	}
}

public class Driven {

	public static void main(String[] args) {
		C.a=10;
		C.b=20;
		C.c=30;
		//b=20;  CTE
		//System.out.println(b);  CTE
		System.out.println(C.b);// 20
		C c1= new C();// another type of method to print using object creation 
		System.out.println(C.b);
		C c2= new C();// because of refernece btw class static area and heap memory it will print the value from the class static area 
		System.out.println(C.b);
		
	}

}
