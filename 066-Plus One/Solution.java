/*
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
*/
//从后往前计算，若该位为9（即有进位），则继续计算下一位，否则返回结果，若遇到每一个位置都是9,则需另开辟一个长度加1的数组存储
//Time:O(n) Space:worst-O(n) best-O(1);
public class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1;i>=0&&carry>0;--i){
        	int sum=digits[i]+carry;
        	digits[i]=sum%10;
        	carry=sum/10;
        }       
        if(carry==0)
        	return digits;
        int[] rst=new int[digits.length+1];
        rst[0]=1;
        for(int i=1;i<rst.length;++i){
        	rst[i]=digits[i-1];
        }
        return rst;
    }
}