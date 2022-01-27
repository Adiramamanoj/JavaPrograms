package Javaprgm;
import java.util.Scanner;
public class Aarrynewkey {

	public static void main(String[] args) {
		/*int arr[]= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}*/
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");// giving input size is 5
		int size= sc.nextInt();
		String arr[]= new String[size];
		System.out.println("enter the names"); // getting values from the user
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.next();
		}
		System.out.println("the elements are");// Displaying the values of elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
