/**
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/
//可以先跟面试官说用比较先进的KMP，Rabin-Karp, KMP algorithm, Boyer- Moore算法 ，但是面试时用brute-force字符串匹配算法足够了
//Time：O(mn) Space:O(1)  (n-haystack.length(),m-needle.length())
public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null||needle==null)
        	return -1;
        int i,j;
        for(i=0;i<haystack.length()-needle.length()+1;++i){
        	for(j=0;j<needle.length();++j){
        		if(haystack.charAt(i+j)!=needle.charAt(j))
        			break;
        	}
        	if(j==needle.length()){
                return i;
        	}
        }
        return -1;
    }

    public static void main(String[] args) {
    	Solution s=new Solution();
    	String [][] pairs={{null,"a"},{"","apple"},{"apple",""},{"apple","pl"}};
    	for(String[]pair:pairs){
    		System.out.println(s.strStr(pair[0],pair[1]));
    	}
    }
}