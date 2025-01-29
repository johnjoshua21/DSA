package day_3;

import java.util.Arrays;

public class TwoPointer {

	public static void main(String[] args) {
		int[] arr={1,3,5,7,2,1,4,7,9,4};
		Arrays.sort(arr);//[1, 1, 2, 3, 4, 4, 5, 7, 7, 9]
		int target=17;
		int[] res=targetSum(arr,target);
		if(res[0]==-1)
			System.out.println("No TargetSum Found");
		else
			System.out.printf("%d is found at %d and %d",target,res[0],res[1]);
	}

	 static int[] targetSum(int[] arr,int x) {
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			int s=arr[l]+arr[r];
			if(s==x)
				return new int[]{l,r};
			if(s>x)
				r--;
			else
				l++;
		}
		return new int[]{-1,-1};	
	}	
}
