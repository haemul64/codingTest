package lv0;

public class _0_떼기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181847

	class Solution {
	    public String solution(String n_str) {
	        int idx = 0;
	        
	        for(int i=0; i<n_str.length(); i++) {
	            if(n_str.charAt(i) != '0') {
	                idx = i;
	                break;
	            }
	        }
	        
	        return n_str.substring(idx);
	    }
	}
}

//Integer.parseInt(n_str);
