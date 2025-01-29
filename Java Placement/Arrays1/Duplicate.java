package Aug_31;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		int arr[]= {1,1,6,7,5,8,44,8,7,9,7,3};
		Arrays.sort(arr);
		int flag=0;
		int i=0;
		//1 1 3 5 6 7 7 7 8 8 9 44 
		for(;i<arr.length-1;i++){
			if(arr[i]==arr[i+1] && arr[i]!=flag) {
				flag=arr[i];
				System.out.println(arr[i]);
			}	
		}
	}
}
