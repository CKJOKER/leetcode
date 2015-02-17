/*
Given two sorted integer arrays A and B, merge B into A as one sorted array.

Note:
You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. 
The number of elements initialized in A and B are m and n respectively.
*/
/*
为避免大量移动，从后向前插入元素（反向插入移动）,原有数组A，B的最后一个元素分别为A[m-1],B[n-1]，那么新数组的最后一个元素的下标应该是m+n-1,
这个元素要么来自A[m-1],要么来自B[n-1]。被选中数组的下标应相应减去1,准备下一轮的挑选。
*/
//Time:O(n) Space:O(1)
public class Solution {
	public void merge(int A[], int m, int B[], int n) {
        while(n>0){       //n-1是最后一个元素，股n=0时说明B已经全部插入A中了,m,n表示A，B中还有m，n个元素尚未完成合并
            if(m<=0||A[m-1]<B[n-1])
            	A[m+n-1]=B[--n];
            else
            	A[m+n-1]=A[--m];
        }
    }
    public static void main(String[] args) {
    	Solution solve=new Solution();
    	int []A={1,1,2,4,5,8,10,0,0,0,0,0};
    	int []B={1,3,6,9,11};
        solve.merge(A,7,B,5);
        for(int a:A)
        	System.out.println(a);
    }
}