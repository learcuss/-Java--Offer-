package 剑指Offer;

import java.util.Scanner;

public class No3Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int arr[] = {1,2,3,1,0,2,5};
		int arr2[] = new int[arr.length];
		
	    boolean k = duplicate(arr,arr.length,arr2);
	}	
	public static boolean duplicate(int[] nums, int length, int[] duplication) {
	    if (nums == null || length <= 0)
	        return false;
	    for (int i = 0; i < length; i++) {
	        //注意，此处不能用if,用while可以保证直到arr[i]=i,用if只循环一次
	    	while (nums[i] != i) {
	            if (nums[i] == nums[nums[i]]) {
	                duplication[0] = nums[i];	               
	                System.out.println(nums[i]);
	                return true;
	            }
	            swap(nums, i, nums[i]);
	        }
	    }
	    return false;
	}
	public static void swap(int[] nums, int i, int j) {
	    int t = nums[i];
	    nums[i] = nums[j];
	    nums[j] = t;
	}

}


