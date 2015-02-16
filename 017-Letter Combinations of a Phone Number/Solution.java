/*
Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.
Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
*/
//经典递归题
import java.util.*;
public class Solution {
	String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public List<String> letterCombinations(String digits) {
		List<String> result=new ArrayList<String>();
		if(digits==null||digits.length()==0)
			return result;
		dsf(result,new StringBuilder(),digits,0);
		return result;
	}
	public void dsf(List<String> list,StringBuilder sb,String digits,int index){
		if(sb.length()==digits.length()){
			list.add(sb.toString());
			return ;
		}
		String s=map[digits.charAt(index)-'0'];
		for(int i=0;i<s.length();++i){
			sb.append(s.charAt(i));
			dsf(list,sb,digits,index+1);
			sb.deleteCharAt(sb.length()-1);
		}
	}
	public static void main(String[] args) {
		Solution s=new Solution();
		String str="23";
        List<String> list=s.letterCombinations(str);
		for(String t:list){
			System.out.println(t);
		}
	}
}