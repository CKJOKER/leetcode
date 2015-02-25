/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
/*
位运算，XOR(异或)，对数组所有元素进行异或，最后留下的一定是单个元素。
Time:O(n) Space:O(1)
*/
public class Solution {
    public int singleNumber(int[] A) {
        int num=0;
        for(int i:A)
        	num^=i;
        return num;
    }
    public static void main(String[] args) {
    	Solution solve=new Solution();
    	int [][] a={{1},{1,1,2,2,3,3,4},{1,1,1,1,2,2,2,3,3}};
    	for(int []A:a){
    		System.out.println(solve.singleNumber(A));
    	}
    }
}