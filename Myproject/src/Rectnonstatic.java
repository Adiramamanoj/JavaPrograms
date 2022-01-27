
public class Rectnonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle.area();
		System.out.println(Rectangle.area);
	}

}
class Rectangle
{
	static int l=2, w=5;
	static double area=w*l;
	public static void area()
	{
		System.out.println("the area of rectangle ");
	}
}
