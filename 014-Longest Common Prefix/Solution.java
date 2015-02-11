//从第一个字符串开始比较，用prefix几下当前的最长公共前缀（以字符串为比较单位）
//Time：O(mn) Space:O(1)   (m-每个字符串长度，n-字符数组长度)  
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)
        	return "";
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
        	// if(strs[i]==null||strs[i].length()==0)
        	// 	return "";
        	int j=0;
        	while(j<prefix.length()&&j<strs[i].length()&&(strs[i].charAt(j)==prefix.charAt(j))){
        		++j;
        	}
        	if(j==0)
        	  return "";
            prefix=prefix.substring(0,j);
        }
        return prefix;
    }
    public static void main(String[] args) {
    	Solution s=new Solution();
    	String[][] arrStrs={{},{""},{"","aa"},{"abc","a","abstract"}};
    	for(String []strs:arrStrs){
    		System.out.println(s.longestCommonPrefix(strs));
    	}
    }
}