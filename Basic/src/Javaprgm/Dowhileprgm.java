package Javaprgm;

public class Dowhileprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ten();
		one();
		even();
		odd();
	}
	public static void ten()
	{
		System.out.println("the numbers from 1 to 10  :");
		int i=1;
		while(i<=10)
		{
			System.out.println(" "+i+" ");
			i++;
		}
	}
	public static void one()
	{
		System.out.print("the numbers from 10 to 1  :");
		int i=10;
		while(i>=1)
		{
			System.out.println(" "+i+" ");
			i--;
		}
	}
	public static void even()
	{
		System.out.print("the even numbers from 1 to 20  :");
		int j=1;
		while(j<=20)
		{
			if(j%2==0)
			{
			System.out.println(" "+j+" ");
		}
			j++;
		}
	}
	public static void odd()
	{
		System.out.print("the odd numbers from 1 to 20  :");
		int a=1;
		while(a<=20)
		{
			if(a%2!=0)
			{
			System.out.println(" "+a+" ");
		}
			a++;
	}
	}
}