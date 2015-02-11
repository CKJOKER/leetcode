/**
Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. 

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
*/
//case0：处理null/empty
//case1：处理空格
//case2：处理正负号
//case3：处理非法字符（之后的一概不处理）
//case4：处理MAX_VALUE/MIN_VALUE
//该Solution有内存溢出的问题
public class Solution {
    public int atoi(String str) {
        if(str==null)
            return 0;
        str=str.trim();
        if(str.length()==0)
        	return 0;
        int index=0;
        int sign=1;
        if(str.charAt(0)=='+')
        	++index;
        else if(str.charAt(0)=='-'){
        	++index;
        	sign=-1;
        }
        long num=0;
        for(;index<str.length();++index){
        	if(str.charAt(index)<'0'||str.charAt(index)>'9')
        		break;
        	num=10*num+(str.charAt(index)-'0');
        	if(num>Integer.MAX_VALUE)
        		break;
        }
        if(num*sign<Integer.MIN_VALUE)
        	return Integer.MIN_VALUE;
        if(num*sign>Integer.MAX_VALUE)
        	return Integer.MAX_VALUE;
        return (int)num*sign;
        
    }
}