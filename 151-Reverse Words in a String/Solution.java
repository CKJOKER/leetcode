/*
Given an input string, reverse the string word by word. For example, Given s = "the sky is blue", return "blue is sky the".
Clarification:
What constitutes a word?
A sequence of non-space characters constitutes a word.
Could the input string contain leading or trailing spaces?
Yes. However, your reversed string should not contain leading or trailing spaces.
How about multiple spaces between two words?
Reduce them to a single space in the reversed string.
*/
//two pass: Time:O(n) Space:O(n)
//按空格split，然后倒序append字符串
public class Solution {
    public String reverseWords(String s) {
         if(s==null)
         	return s;
         String[] array=s.split(" ");
         StringBuilder sb=new StringBuilder();
         for(int i=array.length-1;i>=0;--i){
         	if(!array[i].equals(""))
         		sb.append(array[i]).append(" ");
         	else
         		continue;
         }
         //删除最后一个空格
         if(sb.length()!=0)
           sb.deleteCharAt(sb.length()-1);
         return sb.toString();
    }
    public static void main(String[] args) {
    	Solution solve=new Solution();
    	String str= " the  sky  is    blue ";
    	System.out.println(solve.reverseWords(str));
    }
}