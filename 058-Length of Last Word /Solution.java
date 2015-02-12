/**
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
*/
//简单粗暴去除首尾空格，然后split空格，取最后数组最后一个位置的字符串
public class Solution {
    public int lengthOfLastWord(String s) {
       if(s==null||s.trim().length()==0)
       	  return 0;
       	String []arr=s.split(" ");
       	int length=arr[arr.length-1].length();
       	return length;
    }
    public static void main(String[] args) {
    	Solution s=new Solution();
    	String []str={"Hello world","Hello world ",""," ",null};
    	for(String t:str)
    		System.out.println(s.lengthOfLastWord(t));
    }
}