package Javaprgm;

public class Primerange {
	public static void main(String[]args)
	{
		prime();
		notprime();
	}
	public static void prime() {
		// TODO Auto-generated method stub
		System.out.println("the prime numbers are 1 to 100:");
		int i;
		for(i=2;i<=100;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
			if(i%j==0)
			{
			    flag=false;
			}
			}
			if(flag==true)
			{
				System.out.print(" "+i+" ");
			}
		}
	}
	public static void notprime() {
		// TODO Auto-generated method stub
		System.out.println("the non prime numbers are from 1 to 100");
		int i;
		for(i=2;i<=100;i++)
		{
			boolean flag=false;
			for(int j=2;j<i;j++)
			{
			if(i%j==0)
			{
			    flag=true;
			}
			}
			if(flag==true)
			{
				System.out.print(" "+i+" ");
			}
		}
}
}

