package Javaprgm;

public class Dowhileprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime();
		notprime();
	}
	public static void prime()	
	{
		int num=13, i=2;
		boolean java=true;
		while(i<num)
		{
			if(num%i==0)
			{
			   java=false;
			}
			i++;
		}
		if(java==true)
		{
			System.out.println("the given number is prime "+num);
		}
		else
		{
			System.out.println("the given number is notprime "+num);
		}
	}
	public static void notprime() {
		int num=13, i=1;
		boolean java=true;
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<num);
		{
			if(num%i==0)
			{
				java=false;
			}
		}
		if(java==true)
		{
			System.out.println("the given number is prime "+i);
		}
		else
		{
			System.out.println("the given number is not prime "+i);
		}
	}
		
}
