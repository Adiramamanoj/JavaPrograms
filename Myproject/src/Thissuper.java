// using both this and super calling statements 
public class Thissuper {

	public static void main(String[] args) {
		E c1= new E("bye");
	}

}
class D{
	D(int a){
		this();
		System.out.println("hello");
	}
	D(){
		System.out.println("hi");
	}
}
class E extends D{
	E(String S){
		this(10.2);
		System.out.println(S);
	}
	E(double d){
		super(10);
		System.out.println(10.2);
	}
}
