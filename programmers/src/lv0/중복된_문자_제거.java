package lv0;

public class 중복된_문자_제거 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120888

	class Solution {
	    public String solution(String my_string) {
	        String answer = "";
	        
	        for(int i=0; i<my_string.length(); i++) {
	            String str = my_string.charAt(i) + "";
	            if(!answer.contains(str)) answer += str;
	        }
	        
	        return answer;
	    }
	}
}
