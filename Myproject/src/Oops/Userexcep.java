package Oops;
// WAP to create user exception for matrimony age should be greater than 21 
import java.util.Scanner;

public class Userexcep {
// Custom Exception handling by user creating Exception for Matrimony if Age is less then 21 it should throw Exception and should handle that excepton
	public static void main(String[] args) throws UnderAgeException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Age");
	    int num= sc.nextInt();
	    try {
	    	if(num<=21) {
	    		throw new UnderAgeException(" 'UnderAge Exception'  :Age is Underage");
	    	}
	    	else {
	    		System.out.println("Show Profiles");
	    	}
	    }
	    catch(UnderAgeException u) {
	    	System.out.println(" Exception handled "+ u.Message);
	    } 
	}
} 
class UnderAgeException extends Exception{
	String Message;
	 public UnderAgeException(String Message) {
		// TODO Auto-generated constructor stub
		 this.Message=Message;   
	}
	public  String getMessage() {
		return Message;
	}
	
}
