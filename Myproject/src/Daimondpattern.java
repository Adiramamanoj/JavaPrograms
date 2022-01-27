
public class Daimondpattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
			System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++)
			{
				System.out.println("*");
			}
			System.out.println("");
		}
		for(int i=n-1;i>0;i--)
		{
			for(int j=n-1;j>=i+1;j--)
			{
				System.out.println(" ");
			}
			for(int k=2*i-1;k>0;k--)
			{
				System.out.println("*");
			}
			System.out.println(" ");
		}
}
}
