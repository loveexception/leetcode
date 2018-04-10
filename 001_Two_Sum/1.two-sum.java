/*
 * [1] Two Sum
 *
 * https://leetcode.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (37.99%)
 * Total Accepted:    872.3K
 * Total Submissions: 2.3M
 * Testcase Example:  '[3,2,4]\n6'
 *
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * 
 * Example:
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * 
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	List list = Arrays.asList(nums);
    	int[] result = new int[2];
    	result[0]=-1;
    	result[1]=-1;
    	for(int i=0;i< nums.length ; i ++){
    		int want = target- nums[i] ;
    		for(int j= nums.length-1 ; j > i ; j--){
    			if(nums[j]==want){
    				result[0]= i;
    				result[1]=j;
    				return result;
    			}

    		}

    	}
    	return result;
        
    }
}
