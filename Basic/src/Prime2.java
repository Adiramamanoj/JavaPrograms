
public class Prime2 {             //for range

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=2;i<=100;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
			if(i%j==0)
			{
			    flag=false;
			}
			}
			if(flag==true)
			{
				System.out.println("it is prime number " +i);
			}
		}
	}

}
