
public class Trinonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Triangle().area();
		System.out.println(new Triangle().area);
	}

}
class Triangle
{
	int b=2, h=5;
	double area=0.5*b*h;
	void area() 
	{
		System.out.println("the area of triangle  ");
	}
}
