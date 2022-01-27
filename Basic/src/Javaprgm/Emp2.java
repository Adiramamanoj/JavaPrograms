package Javaprgm;

public class Emp2 {
	
	int id;
	String name;
	String cname;
	Emp2(int id, String name, String cname)
	{
		this.id=id;
		this.name=name;
		this.cname=cname;
	}
	void Emp3()
	{
		System.out.println(id+" "+name+ " "+cname);
	}
	public static void main(String[]args)
	{
		Emp2 A= new Emp2(720, "Manoj", "Test_yantra");
		A.Emp3();
	}

}
