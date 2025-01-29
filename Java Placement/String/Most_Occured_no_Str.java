package Aug_31;
import java.util.Arrays;
public class Most_Occured_no_Str {
	public static void main(String[] args) {		
		int num=566777;
		int arr[]=new int[10];
		int i,max=0,ind=0;
		while(num>0) {
			i=num%10;
			arr[i]++;
			num/=10;
		}	
		max=arr[0];
		int j=0;
		for(;j<arr.length;j++) {
			if(arr[j]>max) {
				max=arr[j];
				ind=j;			
			}}	
		System.out.println(ind+" occures "+arr[ind]+" times");
	}}
