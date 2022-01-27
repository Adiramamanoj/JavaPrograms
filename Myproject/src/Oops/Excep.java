package Oops;
// throws and throw exception handling by Stack winding 
public class Excep {
	 static void a(){
		int k=6/0;
		System.out.println(k);
	}
	 static void b() {
		 a();
	 }
	 static void c() {
		 b();
	 }
	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
		c();
	}

}
