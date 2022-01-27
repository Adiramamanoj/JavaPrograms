import java.util.LinkedList;
public class Queue1 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.offer(10);
		l.offer(20);
		l.offer(30);
		l.offer(40);
		l.offer("Hello");
		l.offer(20);
		System.out.println(l);
		l.poll();
		System.out.println(l);
		System.out.println(l.peek());
		l.poll();
		System.out.println(l);
		System.out.println(l.peek() );
		}

}
