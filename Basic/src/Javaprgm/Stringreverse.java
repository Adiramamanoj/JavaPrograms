package Javaprgm;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String S="Manoj";
		//System.out.println(S.length());
		/*String N="RAM";
		for(int i=N.length()-1;i>=0;i--)
		{
			System.out.println(N.charAt(i));
		}*/
		double actualprize= 27499.00;
		double expectedPrize= 6000.00;
		String s1= String.valueOf(actualprize);
		System.out.println(s1);
		String s2= String.valueOf(expectedPrize);
		System.out.println(expectedPrize);
		if(s1==s2) {
			System.out.println(" actualPrize is less then expectedPrize");
		}
		else {
			System.out.println("The Product Prize is More The Expected Prize");
		}
	}
}
