package day_2;
import java.util.Arrays;
public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {5,2,6,5,1,3,5,7,10};
		int x=5;
		Arrays.sort(arr);
		int res=Binarysearch(arr,0,arr.length-1,x);
		if (res >= 0)
            System.out.println(x + " found at index " + res);
        else
            System.out.println(x + " Not found");
	}
	public static int Binarysearch(int arr[],int l,int r,int x) {
		if (r>=l) {
            int m=l+(r-l)/2;
		if(arr[m]==x) {
			return m;
		}	else if(arr[m]<x) {
			Binarysearch(arr,m+1,r,x);
		}
		else if(arr[m]>x){
			Binarysearch(arr,l,m-1,x);
		}}
		return -1;
	}
}
