package lv0;

public class x_사이의_개수 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181867

	class Solution {
	    public int[] solution(String myString) {
	        
	        String[] strs = myString.split("x", -1);
	        int[] ans = new int[strs.length];
	        
	        for(int i=0; i<ans.length; i++) {
	            ans[i] = strs[i].length();
	        }
	        
	        return ans;
	    }
	}
}
