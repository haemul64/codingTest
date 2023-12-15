package lv0;

public class 문자열의_뒤의_n글자 {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/181910

	class Solution {
	    public String solution(String my_string, int n) {
	        int strLen = my_string.length();
	        return my_string.substring(strLen-n);
	    }
	}
}
