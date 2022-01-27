
public class Multilevel {

	public static void main(String[] args) {
	    H h1= new H();
	    System.out.println(h1.p);
	    System.out.println(h1.n);
	    System.out.println(h1.k);
	    h1.Add2();
	    h1.Add1();
	    h1.Add();
	    G g1= new G();
	    
	    System.out.println(g1.n);
	    System.out.println(g1.k);
	   
	    g1.Add1();
	    g1.Add();
	    F f1= new F();
	    System.out.println(f1.i);
	   
	   
	    f1.Add(); 
	}
}
class F{
	int i;
	int j;
	int k;
	void Add() {
		System.out.println("plus");
	}
}
class G extends F{
	int l;
	int m;
	int n;
	void Add1() {
		System.out.println("sum");
	}
}
class H extends G{
	int p;
	int q;
	int r;
	void Add2() {
		System.out.println("Addition");
	}
}