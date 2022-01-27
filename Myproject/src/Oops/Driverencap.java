package Oops;

public class Driverencap {

	public static void main(String[] args) {
	   A4 a=new A4(10);
	   System.out.println(a.getEid());
	   a.setEid(20);
	   System.out.println(a.getEid());
	}
}
class A4{
	private int Eid;
	public int getEid() {
		return Eid;
	}
	A4(int Eid){
		this.Eid=Eid;
	}
	public void setEid(int Eid) {
		this.Eid=Eid;
	}
}
