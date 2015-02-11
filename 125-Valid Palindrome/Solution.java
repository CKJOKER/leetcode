/**
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
*/
//从两边向中间比较，遇到非法字符就跳过，直到俩指针相遇.
//Time:O(n) Space:O(n)
public class Solution {	
	public boolean isPalindrome(String s) {
		if(s.isEmpty())
			return true;
		int length=s.length();
		int begin=0;
		int end=s.length()-1;
		while(begin<end){
			if(!isValid(s.charAt(begin))){
				++begin;
				continue;
			}
			if(!isValid(s.charAt(end))){
				--end;
				continue;
			}
			if(Character.toLowerCase(s.charAt(begin))!=Character.toLowerCase(s.charAt(end)))
				return false;
			++begin;
			--end;
		}
		return true;
	}
	public boolean isValid(char c){
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Solution s=new Solution();
		String []str={"","  ","A man, a plan, a canal: Panama","race a car"};
		for(String test:str){
			System.out.println(s.isPalindrome(test));
		}
	}
}