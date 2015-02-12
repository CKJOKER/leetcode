/**
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
*/
//Time:O(n) Space:O(n)  (n为s的长度，不管nRows是多少，都必须扫描全部的元素)
public class Solution {
	public String convert(String s, int nRows) {
		if(s==null)
			return "";
		int length=s.length();
		if(nRows==1||length<=nRows) 
			return s;
		StringBuilder sb=new StringBuilder();
         int step=2*nRows-2;   //第一行相邻两个字符的间距
         for(int i=0;i<nRows;++i){
         	int interval=step-2*i;   //第i行相邻两个字符的间距
         	for(int j=i;j<length;j+=step){    //第i行的初始字符在原s中的位置为j
         		sb.append(s.charAt(j));
         		if(interval<step&&interval>0&&j+interval<length){  //前两个条件确保除首行外，其余行在首行相邻两个字符间还有别的字符    
         			sb.append(s.charAt(j+interval));
         		}   
         	}

         }       
         return sb.toString();
     }
     public static void main(String[] args) {
     	Solution s=new Solution();
     	String str="PAYPALISHIRING";
     	System.out.println(s.convert(str,3));
     }
 }