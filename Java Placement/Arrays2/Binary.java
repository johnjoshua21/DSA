package day1;

import java.util.Arrays;

public class Binary {

	public static void main(String[] args) {
		int[] nums= {1,2,2};//1,2,2    1,1,2,2,4	
        Arrays.sort(nums); 
        System.out.println(Arrays.toString(nums)); 
        int res=nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]) {
            res=nums[i];
            }
        }
        if(nums[nums.length-1]!=res)
        	res=nums[nums.length-1];
        System.out.println(res);
	}
}
