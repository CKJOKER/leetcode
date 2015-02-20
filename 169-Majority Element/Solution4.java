/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/
/*
Moore voting algorithm（多数投票算法）：每次都找出一对不同的元素，从数组中删掉，直到数组为空或只有一种元素。 不难证明，如果存在元素e出现频率超过半数，
那么数组中最后剩下的就只有e。当然，最后剩下的元素也可能并没有出现半数以上(本题不会出现这种情况)。比如说数组是[1, 2, 3]，最后剩下的3显然只出现了1次，并不到半数。排除这种情况的
方法是，保存下原始数组，最后扫描一遍验证一下就可以了。但是删除元素可以在常数时间内完成，但找不同元素似乎有点麻烦，换个思维解决这个问题（leetcode）：
We maintain a current candidate and a counter initialized to 0. As we iterate the array, we look at the current element x:
If the counter is 0, we set the current candidate to x and the counter to 1.
If the counter is not 0, we increment or decrement the counter based on whether x is the current candidate.
After one pass, the current candidate is the majority element. Runtime complexity = O(n).

Time:O(n) Space:O(1)
*/
public class Solution4 {
	public int majorityElement(int[] num) {
		int maj=0;
		int count=0;
		int length=num.length;
		for(int item:num){
			if(count==0){
				maj=item;
				++count;
			}
			else if(maj==item){
				++count;
				if(count>length/2)  //减少比较次数
					return maj;
			}
			else
				--count;
		}
		/*count=0;            //这道题不需要这个判断，因为题目已经假设一定存在majority
		for(int i:num){
			if(maj==i)
               ++count;
		}
		if(count>length/2)
		   return maj;
	    return -1;*/
        return maj;
	}
		public static void main(String[] args) {
		Solution4 solve=new Solution4();
		int [][] arr={{1,2,1,1,},{2,2,3,4,2,4,3,2,2,5,2,}};
		for (int []array:arr ) {
			System.out.println(solve.majorityElement(array));
		}
	}
}