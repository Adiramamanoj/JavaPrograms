package Oops;

public class Equal2 {
	int eid; 
	Equal2(int eid){
		this.eid=eid;
	}
	public String toString() {
		return "eid: "+ eid;
	}
	public boolean equals(Object obj) {
		return this.eid==((Equal2)obj).eid;
	}
	public static void main(String[] args) {
		Equal2 e=new Equal2(1);
		Equal2 e1= new Equal2(1);
		System.out.println(e.equals(e1));
	}

}
