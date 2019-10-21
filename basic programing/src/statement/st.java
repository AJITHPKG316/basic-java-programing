package statement;
 import java.util.Scanner;
 
public class st {

		Scanner sc=new Scanner("System.in");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int a,b;
		while(n!=0);
		{
		a=n^n1;
		b=(n&n1)<<1;
		n1=a;
		n=b;
		
		System.out.println(n1);
		}
		// TODO Auto-generated method stub
		

	}

}