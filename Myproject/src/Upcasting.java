// up casting 
public class Upcasting {

	public static void main(String[] args) {
		P p1=new P();// sub class
		System.out.println(p1.i);
		System.out.println(p1.j);
		S s1= new S();// super class
		System.out.println(s1.i);
		System.out.println(p1);
		System.out.println(s1);
		S s2= p1;        // up-casting the sub class object reference to super class type 
		System.out.println(s2);
		System.out.println(s2.i);
		System.out.println(p1);
		//System.out.println(s2.j); CTE because after accessing sub class through super class S by object reference s2 
		                          //it will print address of s2 and p1 but through object reference of super class 
		                          //we cannot access the properties and behaviour of sub class 
		S s3= new P();
		System.out.println(s3.i);
		//System.out.println(s3.j);
		System.out.println(s3);
		
	}
}
class S{ 
	int i;
}
class P extends S{
	int j;
}  