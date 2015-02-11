/**
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
*/
//从后向前扫描（之所以从后往前，因为最后一位是个位，result可以直接确定），比较相邻字符，若左小右大则用现有结果减去，反之则加上
//Time:O(n)orO(1) Space:O(1) (看怎么理解，整个罗马字符都要遍历，但是题目已给范围1-3999,n时字符串长度)
import java.util.HashMap;
public class Solution{
	public int romanToInt(String s) {
        if (s==null||s.length()==0) {
        	return 0;
        }
        HashMap <Character,Integer> map=new HashMap <Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int length=s.length();
        int result =map.get(s.charAt(length-1));
        for(int i=length-2;i>=0;i--){
        	if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
        		result-=map.get(s.charAt(i));
        	else
        		result+=map.get(s.charAt(i));
        }
        return result;
    }

}