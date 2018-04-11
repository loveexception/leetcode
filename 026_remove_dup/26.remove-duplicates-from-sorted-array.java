/*
 * [26] Remove Duplicates from Sorted Array
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 *
 * algorithms
 * Easy (36.36%)
 * Total Accepted:    343.5K
 * Total Submissions: 944.6K
 * Testcase Example:  '[1,1,2]'
 *
 * 
 * Given a sorted array, remove the duplicates in-place such that each element
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * 
 * Example:
 * 
 * Given nums = [1,1,2],
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 * 
 * 
 */
class Solution {
    public int removeDuplicates(int[] nums) {
    	int sum = 0;
    	int j = 0 ; 
    	int next = 0;
    	for(int i = 0 ; i<  nums.length ; i ++ ){
			nums[j] = nums[i];

    		
    		if(next == nums[i] && i!= 0 ){
       			continue;
    		}
    		j++;
    		next = nums[i];
    		sum++;
    	}
        return sum;
    }
}
