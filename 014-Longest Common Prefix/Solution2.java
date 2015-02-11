/**
Write a function to find the longest common prefix string amongst an array of strings.
*/
//从第一个字符串的第一个字符开始比较（以字符为比较单位）
//Time：O(mn) Space:O(m)    (m-第一个字符串长度，n字符数组长度)
public class Solution2 {
    public String longestCommonPrefix(String[] strs) {
          if(strs==null||strs.length==0)
          	return "";
          StringBuilder sb=new StringBuilder();
          int len=strs[0].length();
          for(int i=0;i<len;++i){
          	for(int j=1;j<strs.length;++j){
          		if(i>strs[j].length()-1||strs[0].charAt(i)!=strs[j].charAt(i))
          			return sb.toString();
          	}
          	sb.append(strs[0].charAt(i));
          }
          return sb.toString();
    }
    public static void main(String[] args) {
    	Solution2 s=new Solution2();
    	String[][] arrStrs={{},{""},{"","aa"},{"abc","a","abstract"}};
    	for(String []strs:arrStrs){
    		System.out.println(s.longestCommonPrefix(strs));
    	}
    }
}