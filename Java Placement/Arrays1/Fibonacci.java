package Sep_2;
import java.util.Arrays;
public class Fibonacci {
	
	 int[] fib(int n) {
		int []array=new int[n];
		array[0]=0;
		array[1]=1;
		for(int i=2;i<n;i++) {
			array[i]=array[i-1]+array[i-2];
 		}		
		return array;
	}
	
	
	public static void main(String[] args) {
		Fibonacci obj=new Fibonacci();
		int n=10;
		
		int arr[]=obj.fib(n);
		
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]+".");
			}else
			System.out.print(arr[i]+",");
		}
	}
}