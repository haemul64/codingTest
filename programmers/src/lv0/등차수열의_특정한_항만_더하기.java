package lv0;

public class 등차수열의_특정한_항만_더하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181931
	
	class Solution {
	    public int solution(int a, int d, boolean[] included) {
	        int sum = 0;
	        
	        // 등차수열 a + di
	        for(int i=0; i<included.length; i++) {
	            if(included[i])
	                sum += a + d * i;
	        }
	        
	        return sum;
	    }
	}
}
