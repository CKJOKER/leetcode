/**
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
*/
// 方法：从后往前扫描两个字符串，用carry存储进位，计算当前位置的数字，存入result中,长度小的string扫描完后
//后再单独扫描大的。
//Time：O(n) Space:O(m+n)  (m,n为两个字符串的长度，m<n)
public class Solution {
    public String addBinary(String a, String b) {
         if(a.length()<b.length()){
         	String tmp=a;
         	a=b;
         	b=tmp;
         }
         String result="";
         int pa=a.length()-1;
         int pb=b.length()-1;
         int carry=0;         
         while(pb>=0){
            int sum=(int)(a.charAt(pa)-'0')+(int)(b.charAt(pb)-'0')+carry;
            result=String.valueOf(sum%2)+result;        //注意新的位置要在当前result前！
            carry=sum/2;
            pa--;
            pb--;
         }
         while(pa>=0){
         	int sum=(int)(a.charAt(pa)-'0')+carry;
         	result=String.valueOf(sum%2)+result;
         	carry=sum/2;
         	pa--;
         }
         if(carry==1){
         	result="1"+result;
         }
         return result;
    }
    public static void main(String[] args) {
    	Solution s=new Solution();
    	String [][]pairs={{"1111","111"},{"11","1001"}};
    	for(String[] test:pairs){
    		System.out.println(s.addBinary(test[0],test[1]));
    	}
    }
}