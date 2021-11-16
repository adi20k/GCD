package gcd;

import java.util.*;

public class GCD {
	
	public static void main(String[] args)   
	{  
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt(); 
		int a,b;
		a=n1;
		b=n2;
		while(n1!=n2)   
		{  
			if(n1>n2)  
				n1=n1-n2;  
			else  
				n2=n2-n1;  
		}  
		System.out.printf("GCD of %d and %d is: " +n2,a,b);  
	}

	
}
