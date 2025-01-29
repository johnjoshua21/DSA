package Day_1;

public class FIbannociRecursion {
	static void Fib(int l,int n,int m) {
		if(l==0)
			return;
		System.out.print(n+" ");
		Fib(l-1,m,(n+m));	
	}
	public static void main(String[] args) {	
		Fib(10,0,1);
	}
}