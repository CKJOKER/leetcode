/*
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
*/
/*
注意：这道题和I区别是k=3表示第4行（蛋疼--!）。原理一样，也是一行一行的计算，但是若用用O(n)的空间，则每次产生新行时直接替代旧行，但是需要注意每一行必须从后往前计算
并替代以免计算冲突。
Time:O(n*n)  Space:O(n) 
*/
import java.util.*;
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row=new ArrayList<Integer>();
        row.add(1);
        for(int i=0;i<rowIndex;++i){       //若k=3代表第3行，则两个for循环改为i=1，j=i-1即可
           for(int j=i;j>0;--j){
           	   row.set(j,row.get(j-1)+row.get(j));  //计算新元素要用到前一行产生的元素，所以要从后往前计算，避免新一行的元素刚产生又被直接哪来计算（后面的元素会用到前面的，但是前面的不会用到后面的）
            }
           row.add(1);
        } 
        return row;
    }
    public static void main(String[] args) {
    	Solution solve=new Solution();
    	List<Integer> row=new ArrayList<Integer>();
    	row=solve.getRow(4);
    	for(int item:row){
    		System.out.print(item+" ");
    	}
    	System.out.println();
    }
}