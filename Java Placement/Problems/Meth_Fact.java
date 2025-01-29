package Sep_2;

import java.util.Scanner;

public class Meth_Fact {
	
	long fact(int n) {
		if(n==0||n==1)
			return 1;
		long f=1;
		for(int i=1;i<=n;i++) {
			f*=i;
		}
		return f;
	}

	public static void main(String[] args) {
		Meth_Fact obj=new Meth_Fact();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no:");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" is "+obj.fact(n));
	}
}
