package Oops;
// To String method
public class Objectclass {
	int eid;
	Objectclass(int eid){
		this.eid=eid;
	}
	public String toString() {
		return "EID :"+eid;
	}
	public static void main(String[] args) {
		Objectclass obj=new Objectclass(10);
		System.out.println(obj.toString() );
	}

}
