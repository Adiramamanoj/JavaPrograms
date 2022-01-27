
public class Methodover {

	public static void main(String[] args) {
		Son n1=new Son();
		n1.Lights();
		Father m1=new Father();
		m1.Lights();
		Father m2=n1;// up-casting
		m2.Lights();
	}

}
class Father{
  public void Lights() {
	  System.out.println("Halogen Lights");
  }
}
class Son extends Father
{
	public void Lights()
	{
	System.out.println("LED Lights");
	}
} 
 