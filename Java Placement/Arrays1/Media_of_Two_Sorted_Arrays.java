package Leet;

import java.util.Arrays;

public class Media_of_Two_Sorted_Arrays {

	class Solution {
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	         int a=nums1.length;
	        int b= nums2.length;
	        int c=nums1.length+nums2.length;

	        int[] mergedarray =new int[c];
	        for (int i=0;i<a;i++){
	            mergedarray[i]=nums1[i];
	        }
	        for (int i=a;i<c;i++){
	            mergedarray[i]=nums2[i-a];
	        }
	        Arrays.sort(mergedarray);
	        int l=0;
	        int r=c-1;
	        System.out.println(Arrays.toString(mergedarray));
	        int d=(l+r)/2;

	        if (c%2!=0){
	            System.out.println("D: "+mergedarray[d]);
	            return mergedarray[d];
	        }
	        else {
	            double mid =((double) mergedarray[d]+(double) mergedarray[d+1])/2;
	            System.out.println("m: " +mid);
	            return mid;
	        }

	    }
	    }


}
