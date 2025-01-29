package day1;

//import java.util.Arrays;

public class Sort_by_row {

	public static void main(String[] args) {
		int arr[][]= {{3,6,1,2},{9,4,8,2},{7,4,2,6}};	
		for(int r=0;r<arr.length;r++) {
			arr[r]=sort(arr[r]);
			for(int n:arr[r])
				System.out.print(n+" ");
			System.out.println();
		}
}	
	public static int[] sort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
					int x=arr[j];
					arr[j]=arr[i];
					arr[i]=x;
				}
			}
		}
		return arr;
	}
}