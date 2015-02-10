//因为罗马数字规则规定，自身连用构成数目，或者放在大数的右边连用构成数目，都不能超过三个，放在大数的左边只能用一个。
//所以把放在左边构成数字嗒单独拿出来，计算时就能省去很多麻烦，因为只有在右边的罗马数字，因此只有加法运算，
//随着需要转换的num越来越少，使用StringBuilder不断append直至map的key都比较完。
//Time:O(n)orO(1) Space:O(1)  (n是num大小，1<=num<=3999)
import java.util.LinkedHashMap;
public class Solution {
	public String intToRoman(int num) {
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(1000,"M");
		map.put(900,"CM");
		map.put(500,"D");
		map.put(400,"CD");
		map.put(100,"C");
		map.put(90,"XC");
		map.put(50,"L");
		map.put(40,"XL");
		map.put(10,"X");
		map.put(9,"IX");
		map.put(5,"V");
		map.put(4,"IV");
		map.put(1,"I");
		StringBuilder roman=new StringBuilder();
		for(Integer i : map.keySet()){
            while(num>=i){
            	num-=i;
            	roman.append(map.get(i));
            }
		}
		return roman.toString();
	}
	public static void main(String[] args) {
		Solution s=new Solution();
		//String test={,"V","CMXCIX","MDCCCXCIX","MMMCMXCIX"}; 
		int [] test={5,999,1899,3999};
		for(int num:test ){
			System.out.println(s.intToRoman(num));
		}
	}
}