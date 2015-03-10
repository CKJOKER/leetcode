/*
Given an array of strings, return all groups of strings that are anagrams.

Note: All inputs will be in lower-case.
*/
/*
OJ上要求返回List<String>不太合理，List<List<String>>最好，不过没关系只要把第二个for循环改一下就行
方法：先对字符串进行排序，用HashMap存储排序后的字符串作为key，若key重复则将原顺序字符串加入当前key的value集合中，否则添加新的key和value
*/
import java.util.*;
public class Solution{
	 public List<String> anagrams(String []str){
	 	List<String> ret=new ArrayList<String>();
	 	HashMap<String,List<String>> map=new HashMap<String,List<String>>();
	 	for(String s:str){
	 		char []array=s.toCharArray();
            Arrays.sort(array);
            String sortedStr=new String(array);
            if(map.containsKey(sortedStr)){
            	map.get(sortedStr).add(s);
            }else{
            	List<String> list=new ArrayList<String>();
            	list.add(s);
            	map.put(sortedStr,list);
            }
	 	}
	 	for (List<String> l:map.values()) {
	 		if(l.size()!=1){
	 			ret.addAll(l);
	 		}
	 	}
	 	return ret;
	 }
	 public static void main(String[] args) {
	 	Solution solve=new Solution();
	 	String []str={"dog","gdo","ogd","dog","abc","cba","abcd","a"};
	 	List<String> result=solve.anagrams(str);
	 	for(String s:result){
	 		System.out.println(s);
	 	}
	 }
}