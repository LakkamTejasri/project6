import java.util.*;
public class q3k {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the x,y value");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int temp=1;
		while(y>0)
		{
			temp=temp*x;
			y--;
		}
		System.out.println(temp);
	}
}
