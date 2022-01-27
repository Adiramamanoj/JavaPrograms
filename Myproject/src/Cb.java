// Non static block and constructor
public class Cb {
	Cb()
	{
		System.out.println("constructor I");
	}
	{
		System.out.println("IIB-I");
	}
	{
		System.out.println("IIB-II");
	}
	public static void main(String[] args) {
		Cb c1= new Cb();
		System.out.println("main()");
		Cb c2= new Cb();
	}

}
