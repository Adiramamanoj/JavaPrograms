
public class Methodshadow {

	public static void main(String[] args) {
		Ink i=new Ink();
		i.A1();
		High h=i;// up-casting 
		h.A1();// super class method because it will not override in static to static method so it will give this output 
		       // because static class will loads inside class static area and it has only one copy 
	}

}
class High{
	public static void A1() {
		System.out.println("super class method");
	}
}
class Ink extends High{
	public static void A1() {
		System.out.println("sub class method");
	}
}
