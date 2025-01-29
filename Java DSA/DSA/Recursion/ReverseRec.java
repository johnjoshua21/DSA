package Day_1;

public class ReverseRec {
	
	 static boolean isPrime(int n) {
		 if(n==1||n==0)
			 return false;
		 if(n==2)
			 return true;
		 int count=0;
		 for(int i=2;i<n;i++) {
			 if(n%i==0)
				 count++;
		 }
		 if(count==0)
			 return true;
		 else
			 return false;
	 }
	
	 static void printRev(int n) {
		 if(n==2) {
		 	System.out.println(2);
			 return;
		 	}
		 if(isPrime(n))
			 	System.out.println(n);
		 printRev(n-1);
		 
	 }

	public static void main(String[] args) {
		
		printRev(15);
	}
}
