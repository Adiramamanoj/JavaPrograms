
public class Constrmethod {

	public static void main(String[] args) {
		Constrmethod C= new Constrmethod(2,5.2);
	}
	int a;
	double b;
		Constrmethod(int a, double b)
	{
		this.a=a;
		this.b=b;
		System.out.println(this.a);
		System.out.println(this.b);	
		int c= a+(int)b;
		System.out.println(c);
	}
}
