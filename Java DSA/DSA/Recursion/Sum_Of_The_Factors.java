package Day_1;

public class Sum_Of_The_Factors {
	
	int sumOfFactors(int n,int x) {
		if (x==1)
			return 1;
		if(n%x==0)
				return x+sumOfFactors(n,x-1);
		return sumOfFactors(n,x-1);
		
	}
	
	
	public static void main(String[] args) {
		Sum_Of_The_Factors obj=new Sum_Of_The_Factors();
		int n=5;
		System.out.println(n+obj.sumOfFactors(n,n/2));
	}
}
