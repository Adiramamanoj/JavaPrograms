package Oops;
// Exception Handling 
// 1st method  by try-catch blocks 
public class Exep {

	public static void main(String[] args) {
		int i=5,j=0,k=0;
		int []arr= {5,6,12,4};
		try {
			k= i/j;    
			arr[5]=5;
		}
		catch(ArithmeticException e){
			System.out.println("Exception Handled");
		}
			 System.out.println(k);
			 System.out.println(arr[5]);
	}
}
