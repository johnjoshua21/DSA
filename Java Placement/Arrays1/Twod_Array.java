package Basics;

import java.util.Scanner;

public class Twod_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][];
		arr[0]=new int[4];
		arr[1]=new int[6];
		arr[2]=new int[3];
		System.out.println("Enter Elements:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
				}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
		}
		

	}

}
