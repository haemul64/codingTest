package lv0;

public class 세로_읽기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181904
	
	class Solution {
	    public String solution(String my_string, int m, int c) {
	        String answer = "";
	        
	        for(int i=c-1; i<my_string.length(); i+=m)
	            answer += my_string.charAt(i);
	        
	        return answer;
	    }
	}
}
