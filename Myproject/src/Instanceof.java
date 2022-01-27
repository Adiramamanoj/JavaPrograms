
public class Instanceof {

	public static void main(String[] args) {
		Box obj1= new Box();
		System.out.println(obj1 instanceof App);
		System.out.println(obj1 instanceof Box);
		System.out.println(obj1 instanceof Duck);
		//System.out.println(obj1 instanceof Cat);// CTE 
		
	}
}
class App{
	int i;
}
class Box extends App{
	int j;
}
class Cat extends App{
	int k;
}
class Duck extends Box{
	int l;
}