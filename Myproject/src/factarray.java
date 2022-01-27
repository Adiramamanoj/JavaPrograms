import java.util.Scanner;
public class factarray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size= sc.nextInt();
		int fact=1;
		int arr[]= new int[size];
		System.out.println("enter the Values inside array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			fact=fact*arr[i];
		}
		System.out.println("the factorial of array are  "+fact);
	}

}
