
public class Thisstate {

	public static void main(String[] args) {
		C c1=new C(10);
	}
}
class C{
	C(int a){
		this();
		System.out.println("hello");
}
	C(){
		System.out.println("bye");
	}
}
