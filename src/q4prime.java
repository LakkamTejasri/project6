import java.util.*;
public class q4prime {
	public static void main(String[] args)
	{
		//int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		//int c=0;
		for(int j=10;j<n;j++)
		{
			int c=0;
			for(int i=1;i<n;i++)
			{
				if(j%i==0)
				{
					c++;
					//break;
				}
			}
				if(c==2)
				{
					System.out.println(j);
				}

	}
	}
}
