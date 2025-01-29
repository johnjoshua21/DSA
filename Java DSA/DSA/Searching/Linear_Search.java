package day_2;

public class Linear_Search {

	public static void main(String[] args) {
		int arr[]= {1,3,5,7,2,1,4,7,9,4};
		int x=10;
		linearSearch(x,arr);	
	}
	public static void linearSearch(int x,int[] arr) {
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.printf("%d is found at %d",x,i);
				flag=false;
				break;
			}
		}
		if(flag) 
			System.out.printf("%d is not found in the array",x);
	}

}