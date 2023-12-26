package lv0;

public class 외계행성의_나이 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120834

	class Solution {
	    public String solution(int age) {
	        String num = String.valueOf(age);
	        String ans = "";
	        
	        for(int i=0; i<num.length(); i++)
	            ans += (char)('1' + num.charAt(i));

	        return ans;
	    }
	}
}
