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
//该Solution2是对Solution1内存溢出问题的优化(堪称完美！)
public class Solution2 {
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
        int num=0;
        for(;index<str.length();++index){
        	if(str.charAt(index)<'0'||str.charAt(index)>'9')
        		break;
            if((num>Integer.MAX_VALUE/10)||(num==Integer.MAX_VALUE/10&&str.charAt(index)-'0'>7)){
                if(sign==1)   return Integer.MAX_VALUE;   //Integer.MAX_VALUE=2147483647
                else          return Integer.MIN_VALUE;   //Integer.MIN_VALUE=-2147483648
            }
            num=10*num+(str.charAt(index)-'0');
        }
        return num*sign;        
    }
}