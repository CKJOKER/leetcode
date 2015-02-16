//Time:O(n) Space:O(1)
public class Solution {
    public int removeElement(int[] A, int elem) {
        int i=0;
        int pointer=A.length-1;
        while(i<=pointer){
        	if(A[i]==elem){
        		A[i]=A[pointer];
        		--pointer;
        	}else{
        	  ++i;	
        	}
        }
        return pointer+1;
    }
    public static void main(String[] args) {
    	Solution solve=new Solution();
    	int[] arr={1,2,3,3,3,3,4,5,5,6,6,6,};
    	System.out.println(solve.removeElement(arr,3));
    	System.out.println(solve.removeElement(arr,1));
    }
}