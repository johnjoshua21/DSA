package Leet;
import java.util.Arrays;
public class Remove_duplicate {
	    public int removeDuplicates(int[] nums) {	        
	        Arrays.sort(nums);
	        int size= nums.length;
	        int[] nums1=new int[size];
	        int j=0;
	        nums1[j]=nums[0];
	        for (int i=1;i< size;i++){
	            if (nums[i]!=nums1[j]){
	                j++;
	                nums1[j]=nums[i];
	            }
	    }
	        for (int i=0;i<size;i++){
	            nums[i]=nums1[i];
	        }
	        System.out.println(Arrays.toString(nums));
	        return j+1;
	    }
	}


