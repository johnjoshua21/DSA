package Basics;
import java.util.Scanner;
public class Delete {
	public static void main(String[] args) {
		int arr[]= {1,5,6,7,7,8,44,8,7,9,7};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				x++;
				for(int j=i;j<arr.length-1;j++) {
					arr[j]=arr[j+1];					
				}
				i--;
				arr[arr.length-x]=0;
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");		
}}}