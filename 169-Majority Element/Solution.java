/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/
//先排序，然后取数组你n/2位置
//Time:O(nlogn)-排序时间 Space：O(1)
import java.util.Arrays;
public class Solution{
	public int majorityElement(int[] num){
           Arrays.sort(num);
           return num[num.length/2];		
	}
	public static void main(String[] args) {
		Solution solve=new Solution();
		int [][] arr={{1,2,1,1,},{2,2,3,4,2,4,3,2,2,5,2,}};
		for (int []array:arr ) {
			System.out.println(solve.majorityElement(array));
		}
	}
}