package day1;

import java.util.Arrays;

public class Selectionsort {
	public static void main(String[] args) {
		int[] arr={15,4,18,43,63,2,434,5,6,7};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
					int x=arr[j];
					arr[j]=arr[i];
					arr[i]=x;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
