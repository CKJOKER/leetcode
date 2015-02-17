/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].
*/
//双指针
//Time:O(n) Space:O(1)
public class Solution {
    public int removeDuplicates(int[] A) {
        if(A==null||A.length==0)
        	return 0;
        int begin=0;
        int end=begin+1;
        while(end<A.length){
        	if(A[end]==A[begin]){
        		++end;
        	}else{
        		A[++begin]=A[end++];
        	}
        }
        return begin+1;
    }
    public static void main(String[] args) {
        Solution solve=new Solution();
        int [][] arr={{},{1},{1,1},{1,2},{1,2,2,3,3,3,4}};
        for(int [] A:arr)
        System.out.println(solve.removeDuplicates(A));
    }
}