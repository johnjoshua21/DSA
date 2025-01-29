package day1;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr={15,4,18,43,63,2};
		for(int i=0;i<arr.length;i++) {
			boolean count=true;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int x=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;
					count=false;
				}
			}
			if(count)
				break;
			System.out.println(Arrays.toString(arr));
		}
		
	}
}
