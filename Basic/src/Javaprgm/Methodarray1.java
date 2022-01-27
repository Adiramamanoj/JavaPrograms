// WAP to print by  using method parameters, return type of all arrays 

package Javaprgm;
import java.util.Scanner;
public class Methodarray1 {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int arr[]=new int[5];
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  int add=sum(arr);
	  System.out.println(add);
	  
	}
	public static int sum(int arr[])
	{ 
		int sum=0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	sum=sum+arr[i];
	    }
	     return sum;
	}
}
   