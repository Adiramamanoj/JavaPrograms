// WAP to print the sum using two class ad non static to static method using object 
package Javaprgm;

 class Driver {
       int a;
       int b;
       int c;
       int sum=0;
       public void Add(int a, int b, int c)
       {
    	   this.a=a;
    	   this.b=b;         // local variable assinging the Global Variable 
    	   this.c=c;
    	   sum=a+b+c;
    	   System.out.println(sum);
       }
}
class Test{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver a1= new Driver();
		a1.a=10;        // Calling the global variable 
		a1.b=20;
		a1.c=30;
		System.out.println(a1.a);
		System.out.println(a1.b);       
		System.out.println(a1.c);
		a1.Add(20, 30, 50);
	}

}
