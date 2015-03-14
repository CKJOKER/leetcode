/*
Given a string containing only digits, restore it by returning all possible valid IP address combinations.

For example:
Given "25525511135",

return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
*/
import java.util.*;
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> list=new ArrayList<String>();
        restore(s,0,0,list);
        return list;
    }
    public void restore(String s,int start,int part,List<String>list){
        if(s.length()-start>(4-part)*3)
          return ;
        if(s.length()-start<4-part)
          return ;
                  
    }
    public static void main(String[] args) {
    	Solution solve=new Solution();
    	List<String> list=solve.restoreIpAddresses("test");
    	for(String s:list){
    		System.out.println(s);
    	}
    }
}
