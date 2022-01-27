package Javaprgm;
import java.util.Scanner;
public class Sumarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		System.out.println("enter the values");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("the sum of elements are  "+sum);
	}
}
