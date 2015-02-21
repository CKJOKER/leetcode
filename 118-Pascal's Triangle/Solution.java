/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/
/*
利用三角形的生成规律，每一行的开头和结尾的1单独添加，其余（从第三行开始）利用上一行元素和
Time:O(n^2)-计算的次数是等差数列之和，以5为例：1+2+3+4+5=n*(n+1)/2=n^2  Space:O(n^2)-与Time同理

*/
import java.util.*;
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<List<Integer>>();
        if(numRows<1)
        	return triangle;
        for(int i=0;i<numRows;++i){
        	List<Integer> row=new ArrayList<Integer>();
        	row.add(1);
        	for(int j=1;j<i;++j){
        		row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));   //关键规律
        	}
        	if(i!=0)                    //第一行只有一个1
        	  row.add(1);   
        	triangle.add(row);
        }
        return triangle;
    }
    public static void main(String[] args) {
    	Solution solve=new Solution();
    	List<List<Integer>> list=new ArrayList<List<Integer>>();
    	list=solve.generate(5);
    	for(List<Integer> rows:list){
           for(int num:rows){
           	 System.out.print(num+" ");
           }
           System.out.println();
    	}
    }
}