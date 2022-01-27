package Javaprgm;

public class Namenonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sample().demo();
		System.out.println(new Sample().S);
	}

}
class Sample
{
	String S="Java";
	void demo()
	{
		System.out.println("object oriented");
	}
}
