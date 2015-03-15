/*
Given a string containing only digits, restore it by returning all possible valid IP address combinations.

For example:单,冰女,塞恩
Given "25525511135",

return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
*/
import java.util.*;
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> list=new ArrayList<String>();
        String ip="";
        generate(s,0,0,ip,list);
        return list;
    }
    public void generate(String s,int start,int part,String ip,List<String>list){
        if(s.length()-start>(4-part)*3)
          return ;
        if(s.length()-start<4-part)
          return ;
        if(part==4){
        	ip=ip.substring(0,ip.length()-1);
        	list.add(ip);
        	return ;
        }
        int num=0;
        for(int i=start;i<Math.min(s.length(),start+3);++i){  //每个位置有3种可能每一种可能都一路
            num=num*10+(s.charAt(i)-'0');
            if(num<=255){
            	generate(s,i+1,part+1,ip+num+".",list);   //dfs
            }
            if(num==0)
            	break;    //不做处理执行下一个可能
        }
                  
    }
    public static void main(String[] args) {
    	Solution solve=new Solution();
    	List<String> list=solve.restoreIpAddresses("010010");
    	for(String s:list){
    		System.out.println(s);
    	}
    }
}
