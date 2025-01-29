package Basics;
import java.util.Scanner;
public class Largest {
	public static void main(String[] args) {
		int arr[]= {1,2,3,44,5,6,7,8,88,9};
		Scanner sc=new Scanner(System.in);	
		int big=arr[0];
		int ind=0;
		for(int i=0;i<arr.length;i++ ) {
			//if(arr[i]<big) for minimum
			if(arr[i]>big) {
				big=arr[i];
				ind=i;
			}
		}
		System.out.println("Largest no in given array is "+big+" at "+ind);
	}
}
