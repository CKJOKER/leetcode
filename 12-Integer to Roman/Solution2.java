//对每个位的罗马数字穷举然后，依次求出num的各个位数字，然后对应其罗马数字
//Time:O(1) Space:O(1)
public class Solution2 {
	public String intToRoman(int num) {
		String []M={"","M","MM","MMM"};
		String []C={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String []X={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String []I={"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String roman=M[num/1000]+C[(num%1000)/100]+X[(num%100)/10]+I[(num%10)/1];
		return roman;
	}
	public static void main(String[] args) {
		Solution2 s=new Solution2();
		//String test={,"V","CMXCIX","MDCCCXCIX","MMMCMXCIX"}; 
		int [] test={5,999,1899,3999};
		for(int num:test ){
			System.out.println(s.intToRoman(num));
		}
	}
}