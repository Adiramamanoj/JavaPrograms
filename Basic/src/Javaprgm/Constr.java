package Javaprgm;

public class Constr {
	int a;
	int b;
	int c;
	Constr(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		
	}
	public static void main(String[]args)
	{
		Constr c1= new Constr(1,2,3);
	}
	
	/*Constr()
	{
		int a=1;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		Constr b = new Constr();

	}*/

}
