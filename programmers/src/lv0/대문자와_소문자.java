package lv0;

public class 대문자와_소문자 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120893

	class Solution {
	    public String solution(String my_string) {
	        String answer = "";
	        
	        for(String str : my_string.split("")) {
	            if('a' <= str.charAt(0) && str.charAt(0) <= 'z') answer += str.toUpperCase();
	            else answer += str.toLowerCase();
	        }
	        
	        return answer;
	    }
	}
}

// 다른 풀이
// String.valueOf(c).toLowerCase(); 
