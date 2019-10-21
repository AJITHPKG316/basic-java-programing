package nestedsw;

import java.util.Scanner;

public class cad {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%4==0)
		{
			if(a%100==0)
			{
				if(a%400==0)
		System.out.println("leap year");
		else
			System.out.println("not leap year");
			}
		else 
			System.out.println(" leap year");
		}
	    else
        System.out.println"(not leap year");
		// TODO Auto-generated method stub
	}
	}
	


