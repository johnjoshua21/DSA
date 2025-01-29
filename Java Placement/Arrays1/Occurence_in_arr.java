package Basics;

import java.util.Scanner;

public class Occurence_in_arr {
	//Second Occurence
	public static void main(String[] args) {
		int arr[]= {1,2,3,44,5,6,44,7,8,44,8,9};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		int flag=0;
		for(int i=0;i<arr.length;i++ ) {
			if(arr[i]==n) {
				if(flag==1) {
					System.out.printf("Element found at %d index",i);
					break;
				}
				else
				flag++;	
				
			}
		}
		if(flag==0)
			System.out.println("-1");
	}

}
