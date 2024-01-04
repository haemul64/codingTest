package lv1;

public class 자연수_뒤집어_배열로_만들기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/12932
	
	class Solution {
	    public int[] solution(long n) {
	        StringBuilder sb = new StringBuilder(""+n);
	        char[] ch = sb.reverse().toString().toCharArray();
	        int[] ans = new int[ch.length];
	        
	        for(int i=0; i<ans.length; i++) {
	            ans[i] = ch[i] - '0';
	        }
	        
	        return ans;
	    }
	}
}
