package Aug_31;
import java.util.Arrays;
import java.util.Scanner;
public class Unique {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array:");
		int x=sc.nextInt();
		int arr[]=new int[x];
	
		System.out.println("Enter elemnts");
		for(int i=0;i<x;i++) {
			arr[i]=sc.nextInt();
		}
	
		int flag=0;
		int i=0;
		
		System.out.println("Array before sorting");
		for(int k:arr)
			System.out.print(k+" ");
		System.out.println();
		
		System.out.println("Array After sorting");
		Arrays.sort(arr);
		for(int k:arr)
			System.out.print(k+" ");
		System.out.println();
		
		System.out.println("Unique Element");
		for(;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1] && arr[i]!=flag) {
				System.out.print(arr[i]+" ");
			}	
			else {
				flag=arr[i];
			}
		}
		System.out.println(arr[i]);
	}
}
