/*
 * [4] Median of Two Sorted Arrays
 *
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 *
 * algorithms
 * Hard (23.04%)
 * Total Accepted:    250.1K
 * Total Submissions: 1.1M
 * Testcase Example:  '[1,3]\n[2]'
 *
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * 
 * Find the median of the two sorted arrays. The overall run time complexity
 * should be O(log (m+n)).
 * 
 * Example 1:
 * 
 * nums1 = [1, 3]
 * nums2 = [2]
 * 
 * The median is 2.0
 * 
 * 
 * 
 * Example 2:
 * 
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 
 * The median is (2 + 3)/2 = 2.5
 * 
 * 
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        LinkedList<Integer>  left = new LinkedList(ins(nums1));
        LinkedList<Integer> right = new LinkedList(ins(nums2));


        while(true){
            int sum = left.size()+right.size();
            if(sum<3){
                break;
            }
            bigger(left,right).removeLast();
            small(left,right).removeFirst();

        }
        List<Integer> list = new ArrayList();

        list.addAll(left);
        list.addAll(right);
        int sum = 0;

        for(Integer one: list){
            sum += one;
        }
        return 1.0*sum/list.size();



    }
    public List<Integer> ins(int[] some){
        List<Integer> result = new ArrayList();
        for (int i :some) {
            result.add(i);
        }
        return result;

    }

    public LinkedList bigger(LinkedList<Integer> left ,LinkedList<Integer> right){
        
        if(left.size()<1){
            return right;
        }
        if(right.size()<1){
            return left;
        
        }
        Integer l = left.getLast();
        Integer r = right.getLast();
        if(l-r>0){
            return left;
        }
        return right;

    }
    public LinkedList small(LinkedList<Integer> left ,LinkedList<Integer> right){
        if(left.size()<1){
            return right;
        }
        if(right.size()<1){
            return left;
        }
        Integer l =  left.getFirst();
        Integer r = right.getFirst();

        if(l-r>0){
            return right;
        }
        return left;

    }
}
