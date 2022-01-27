package Javaprgm;
// for printing Array using decleartion and initialization:
public class Array1 {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,10};
		System.out.println(a[4]);
		System.out.println(a[6]);
		System.out.println(a.length);
		System.out.println(a[a.length-1]);
		for(int i=0;i<=a.length-1;i++)// to print all array values we use for loop
		{
			System.out.println(a[i]);
		}
	}

}
