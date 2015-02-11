/**
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
*/
//将版本号按.分开，从左至右逐个比较大小
public class Solution {
    public int compareVersion(String version1, String version2) {
        String []v1=version1.split("\\.");
        String []v2=version2.split("\\.");
        int maxLen=v1.length>v2.length?v1.length:v2.length;
        for(int i=0;i<maxLen;++i){
        	int ver1=i<v1.length?Integer.parseInt(v1[i]):0;
        	int ver2=i<v2.length?Integer.parseInt(v2[i]):0;
        	if(ver1>ver2)
        		return 1;
        	else if(ver1<ver2)
        		return -1;
        }
        return 0;
    }
    public static void main(String[] args) {
    	Solution s=new Solution();
    	String [][]pairs={{"1","1.00.00"},{"1.10","1.9"},{"1.0.11","2.0.5"}};
    	for(String[] pair:pairs){
    		System.out.println(s.compareVersion(pair[0],pair[1]));
    	}
    }
}