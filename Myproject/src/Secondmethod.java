
public class Secondmethod {

	
	int a;
	int b;
	int c;
	int sum=0;
	public void Add(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		sum= a+b+c;
		System.out.println(sum);
	}
}
class Two
{
	public static void main(String[]args)
	{
	Secondmethod A= new Secondmethod();
	A.a=10;
	A.b=20;
	A.c=30;
	System.out.println(A.a+" "+A.b+" "+A.c);
	A.Add(20, 30, 50);
}
}
