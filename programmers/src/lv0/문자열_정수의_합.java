package lv0;

public class 문자열_정수의_합 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181849
	
	class Solution {
	    public int solution(String num_str) {
	        int sum = 0;
	        
	        for(char ch : num_str.toCharArray()) {
	            sum += ch - '0';
	        }
	        
	        return sum;
	    }
	}
}