
public class Nonblock {
	int a;
	{
		a=10;
		System.out.println(a);
	}
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Nonblock c1= new Nonblock();
		System.out.println("main()");
		Nonblock c2= new Nonblock();
	}
}	