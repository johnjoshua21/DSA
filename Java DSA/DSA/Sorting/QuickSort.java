package day_3;
import java.util.Arrays;
public class QuickSort {

	public static void main(String[] args) {
		int arr[]= {1,5,2,8,9,3,7};
		Quick(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void Quick(int arr[],int l,int r) {
		if(l<r) {
			int pivot=Part(arr,l,r);
			Quick(arr,l,pivot-1);
			Quick(arr,pivot+1,r);
		}
	}
	
	
	public static int Part(int arr[],int l,int r) {
		int pivot=arr[l];
		int i=l+1;
		int j=r;
		while(true) {
			while (i <= j && arr[i] <= pivot)
				i++;
		while (j >= l && arr[j] > pivot)
				j--;
			if(i>j)
				break;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		arr[l]=arr[j];
		arr[j]=pivot;
	
		return j;
	}
}
