package Sep_2;

import java.util.Scanner;

public class Prime {
	
	boolean isprime(int n) {
		if (n==0||n==1)
			return false;
		int i=2;
		while(i<n/2) {
			if(n%i==0)			
				return false;
			i++;
		}
		return true;				
	}

	public static void main(String[] args) {
		Prime obj=new Prime();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no:");
		int n=sc.nextInt();
		if(obj.isprime(n)) 
			System.out.println(n+" is a prime number");
		
		else
			System.out.println(n+" is a not prime number");
	}

}
