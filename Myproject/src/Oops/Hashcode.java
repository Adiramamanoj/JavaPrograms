package Oops;

public class Hashcode {

	public static void main(String[] args) {
		L l1=new L(1);
		L l2=new L(1);
		System.out.println(l1.equals(l2));
		System.out.println(l2.hashCode());
		System.out.println(l1.hashCode());
	}

}
class L {
	int eid;
	L(int eid){
		this.eid=eid;
	}
	public String toString() {
		return "eid :"+ eid;
	}
	/*public boolean equals(Object obj) {
		return this.eid=(((L)obj.eid));
	}*/
	public int hashCode() {
		return eid+99;
	}
	
}
