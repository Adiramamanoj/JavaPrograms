import java.util.ArrayList;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
	    Stack s=new Stack();
	    s.push(10);
	    s.push(20);
	    s.push(30);
	    System.out.println(s);
	    s.pop();
	    System.out.println(s);
	    System.out.println(s.peek());
	    ArrayList a=new ArrayList(s);   // to remove the value by using index we have to convert from stack to arraylist
	    a.remove(0);    
	    System.out.println(a);
	}

}
