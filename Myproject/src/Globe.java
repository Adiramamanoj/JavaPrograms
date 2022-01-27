
public class Globe {
	int a;
	int b;
	String c;
	public static void main(String[] args) {
	
		Globe B= new Globe();
		String Z= B.sum(25, 50, "Hello");
		System.out.println(Z);
	}
	String sum(int a, int b, String c) {
		this.a=a;
		this.b=b;
		this.c=c;
		String x=a+b+c;
		return x;
}
}
