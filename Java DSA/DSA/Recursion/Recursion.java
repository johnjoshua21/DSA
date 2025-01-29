package Day_1;

public class Recursion {
	
	static int factRec(int n) {
		if(n==1)
			return 1;
		return n*factRec(n-1);
	}
	
	static int factLoop(int n) {
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Recursion obj=new Recursion();
		System.out.println(factRec(5));
		System.out.println(factLoop(5));
		
	}

}
