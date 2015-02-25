/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
/*
对hashmap做的改进
Time:O(n) Space:O(n)
*/
import java.util.HashSet;
public class Solution3 {
	public int singleNumber(int[] A) {
		HashSet<Integer> set=new HashSet<Integer>();
		for(int item:A){
			if(set.contains(item)){
				set.remove(item);
			}
			else
				set.add(item);
		}       
		return set.iterator().next();
	}
	public static void main(String[] args) {
		Solution solve=new Solution();
		int [][] a={{1},{1,1,2,2,3,3,4},{1,1,1,1,2,2,2,3,3}};
		for(int []A:a){
			System.out.println(solve.singleNumber(A));
		}
	}
}