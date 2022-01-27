
public class Hierarchiallevel {

	public static void main(String[] args) {
		W w1= new W();
		System.out.println(w1.m);
		System.out.println(w1.i);
		System.out.println(w1.j);
		Z z1= new Z();
		System.out.println(z1.i);
		System.out.println(z1.j);
		
	}

}
class Z{
	int i;
	int j;
}
class Y extends Z{
	int k;
}
class X extends Z{
	int l;
}
class W extends Z{
	int m;
}