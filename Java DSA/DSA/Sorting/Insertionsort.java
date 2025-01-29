package day1;

import java.util.Arrays;

public class Insertionsort {

	public static void main(String[] args) {
		int[] arr={15,4,18,43,63,2,434,5,6,7};
		int j,temp;
		for(int i=1;i<arr.length;i++) {
			temp=arr[i];
			j=i-1;
			while(j>=0 && temp>=arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
