package Javaprgm;
import java.util.Scanner;
public class Cparatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		   int Add=Sum(a,b);
		   System.out.println("the sum of two numbers are  "+Add);
	}
	public static int Sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
}
