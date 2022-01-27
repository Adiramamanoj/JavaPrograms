package Javaprgm;

public class Nonstaticblock {

	static int a=30;
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("hello");
            Nonstaticblock c= new Nonstaticblock();
	}

}
