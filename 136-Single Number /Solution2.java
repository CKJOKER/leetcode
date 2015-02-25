/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
/*
用HashMap存储元素和数量，然后再遍历一遍，没有利用好every element appears twice except for one这个条件，而且不如hashset快
Time:O(n) Space:O(n)
*/
import java.util.HashMap;
public class Solution2 {
	public int singleNumber(int[] A) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i:A){
			if(map.containsKey(i))
				map.put(i,map.get(i)+1);
			else
				map.put(i,1);
		} 
		for(int item:map.keySet()){
			if(map.get(item)==1)
				return item;
		}       
		return -1;
	}
	public static void main(String[] args) {
		Solution solve=new Solution();
		int [][] a={{1},{1,1,2,2,3,3,4},{1,1,1,1,2,2,2,3,3}};
		for(int []A:a){
			System.out.println(solve.singleNumber(A));
		}
	}
}