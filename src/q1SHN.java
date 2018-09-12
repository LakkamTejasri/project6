import java.util.*;
public class q1SHN {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp;
		int l=n%10;
		int k=0;
		while(n!=0)
		{
			temp=n%10;
			if(temp>l)
			{
					k=l;
					l=temp;
			}
			else if(temp>k)
			{
				k=temp;
			}
			n=n/10;
	
			
		}
		System.out.println(k);
	}

}
