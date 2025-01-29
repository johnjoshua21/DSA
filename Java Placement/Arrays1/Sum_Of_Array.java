package Basics;

import java.util.Scanner;

public class Sum_Of_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of the array is "+sum);
		System.out.println("Average of the array is "+(float)sum/arr.length);
		
	}

}
