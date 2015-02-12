/**
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
*/
//用数组的思维解决，从后往前扫描，从第一个非空格字符起计算，遇到空格就返回长度
//Time:O(n)  Space:O(n)
public class Solution2 {
    public int lengthOfLastWord(String s) {
        // if(s==null)     
        //    return 0;
        char []arr=s.toCharArray();
        int length=0;
        for(int i=s.length()-1;i>=0;--i){
        	if(length==0){
        		if(s.charAt(i)==' ')
        			continue;
        		else
        			++length;
        	}else{
        		if(s.charAt(i)==' ')
        			break;
        		else
        			++length;
        	}
        }
        return length;
    }
    public static void main(String[] args) {
    	Solution s=new Solution();
    	String []str={"Hello world","Hello world ",""," ",null};
    	for(String t:str)
    		System.out.println(s.lengthOfLastWord(t));
    }
}