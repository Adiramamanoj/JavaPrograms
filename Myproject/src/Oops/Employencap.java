package Oops;

public class Employencap {

	public static void main(String[] args) {
	Employee e=new Employee("manoj", 752, 30000, "Asso Software Engineer");
	e.setsalary(35000);
//	System.out.println(e.getsalary() );
	displayDetails(e);
	}
	public static void displayDetails(Employee e) {
		System.out.println(e.getname());
		System.out.println(e.geteid());
		System.out.println(e.getsalary());
		System.out.println(e.getdesignation());  
	}
}
 class Employee{
	 private String name;
	 private int eid;
	 private double salary;
	 private String designation;
	 Employee(String name, int eid, double salary, String designation){
		 this.name=name;
		 this.eid=eid;
		 this.salary=salary;
		 this.designation=designation;
	 }
	 public String getname() {
		 return name;
	 }
	 public void setname(String name) {
		 this.name=name;
	 }
	 public int geteid() {
		 return eid;
	 }
	 public void seteid(int eid) {
		 this.eid=eid;
	 }
	 public double getsalary() {
		 return salary;
	 }
	 public void setsalary(double salary) {
		 if(salary>this.salary) {
			 System.out.println("salary is updated   "+ salary);
		 }
		 else {
			 System.out.println("salary is not updated");
		 }
	 }
	 public String getdesignation() {
		 return designation;
	 }
	 public void setdesignation(String designation) {
		 this.designation=designation;
	 }
 } 
