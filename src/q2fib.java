import java.util.*;
public class q2fib {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
		
	}

}
