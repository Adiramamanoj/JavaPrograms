
public class Prime1 {

	public static void main(String[] args) {
		int num=13, count=0, i;
		for(i=2;i<num;i++)  //for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
			if(count==0)     //(count==2)
			{
				System.out.println("The given number is Prime " +num);
			}
			else
			{
				System.out.println("The given number is not a Prime" +num);
			}
	}

	
	
}
