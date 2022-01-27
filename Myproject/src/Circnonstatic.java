
public class Circnonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Circle().area();
		System.out.println(new Circle().area);
	}

}
class Circle
{
	int r=5;
	double area=3.142*r*r;
	void area()
	{
		System.out.println("the area of circle are  ");
	}
}
