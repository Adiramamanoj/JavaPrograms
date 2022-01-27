package Javaprgm;

public class Lefttrianglealpha {

	public static void main(String[] args) {
		char K=48;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char) K); //type casting (Narrowing) from int to char
				K++;
			}
			System.out.println();
		}

	}

}
