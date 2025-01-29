package day_3;
import java.util.Arrays;
public class MergeSort {
	
	public static void main(String[] args) {
		int arr[]= {1,5,2,8,9,3,7,6};
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	static void mergeSort(int arr[],int low,int high) {
		if(low<high) {
			int mid=low+(high-low)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	 static void merge(int[] arr, int low, int mid, int high) {
		 int l1=mid-low+1;
		 int l2=high-mid;
		 int left[]=new int[l1];
		 int right[]=new int[l2];
		 for(int i=0;i<l1;i++) 
			 left[i]=arr[low+i];
		 for(int i=0;i<l2;i++) 
			 right[i]=arr[mid+1+i];
		 int i=0,k=low,j=0;
		 while(i<l1 && j<l2) {
			 if(left[i]<=right[j]) 
				 arr[k++]=left[i++];
			 else
				 arr[k++]=right[j++];
		 }
		 while(i<l1) 
			 arr[k++]=left[ i++];			 
		 while(j<l2) 
			 arr[k++]=right[j++];
		
	}
}