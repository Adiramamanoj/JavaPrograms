package Javaprgm;
// constructor prgm
public class Employeeprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employeeprgm E= new Employeeprgm(720,"Manoj","Test_yantra");	
	}
		int id;
		String name;
		String Cname;
		Employeeprgm(int id, String name, String Cname)
		{
			this.id= id;
			this.name= name;
			this.Cname= Cname;
			System.out.println(this.id);
			System.out.println(this.name);
			System.out.println(this.Cname);
		}
	}
