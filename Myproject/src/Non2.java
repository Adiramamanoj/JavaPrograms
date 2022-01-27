
public class Non2 {
	int a=10;
	{
		int a=20;
		System.out.println(a);
	}
	{
		int a=30;
		System.out.println(this.a);// this keyword will call the global variable // 10
		System.out.println(a);// this will call the local varible value only //30
	}
	public static void main(String[] args) {
		Non2 c1= new Non2();
	}
}
