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