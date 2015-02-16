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
//one pass: Time:O(n) Space:O(n)
//从后向前扫描，记录每个词的结束点和起始点，遇到起始点时就append
public class Solution2 {
    public String reverseWords(String s) {
        if(s==null)
          return s;
        StringBuilder sb=new StringBuilder();
        int end=s.length();
        for(int i=end-1;i>=0;--i){
        	if(s.charAt(i)==' '){
               end=i;             //end指向单词末尾最近的空格
        	}else if(i==0||s.charAt(i-1)==' '){
        		if(sb.length()!=0)
        		  sb.append(" ");
        		sb.append(s.substring(i,end));
        	}
        }
        return sb.toString();
    }
        public static void main(String[] args) {
    	Solution solve=new Solution();
    	String str= " the  sky  is    blue ";
    	System.out.println(solve.reverseWords(str));
    }
}