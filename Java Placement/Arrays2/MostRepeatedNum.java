package day1;

import java.util.Arrays;

public class MostRepeatedNum {

	public static void main(String[] args) {
		
		//[8, 15, 15, 16, 16, 21, 21, 21, 25, 30]
		int[] arr={25,30,21,16,21,15,21,8,16,15,30,30,21};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int x=arr[0];
		int max=0;
		int count=0;
		for(int i=0;i<arr.length-1;i++) {		
			if(arr[i]==arr[i+1]) {
				count++;
				if(max<=count) {
					max=count;
					x=arr[i];
					}
			}
			else
				count=0;		
		}
		System.out.println(x);
	}

}
