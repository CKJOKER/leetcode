/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/
/*
用HashMap存储数字跟它出现的次数，然后遍历找出majority
Time:O(n) Space:O(n)
*/
import java.util.HashMap;
public class Solution3 {
    public int majorityElement(int[] num) {
        HashMap <Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:num){
        	if(map.containsKey(i)){
        		map.put(i,map.get(i)+1);
        	}else
        	    map.put(i,1);
        }
        for(int item:map.keySet()){
        	if(map.get(item)>num.length/2)
        		return item;
        }
        return -1;
    }
    public static void main(String[] args) {
		Solution3 solve=new Solution3();
		int [][] arr={{1,2,1,1,},{2,2,3,4,2,4,3,2,2,5,2,}};
		for (int []array:arr ) {
			System.out.println(solve.majorityElement(array));
		}
	}
}