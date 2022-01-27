package Oops;
// equals method to check the same object reference in the objects and sub class when object created
public class Equalsmethod {
	int eid;
	Equalsmethod(int eid){
		this.eid=eid;
	}
	public static void main(String[] args) {
		Equalsmethod eq=new Equalsmethod(1);
		Equalsmethod eq2=new Equalsmethod(1);
		System.out.println(eq.equals(eq2));
		System.out.println(eq);
		System.out.println(eq2 );
	}

}
