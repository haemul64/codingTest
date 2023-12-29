package lv0;

public class 문자열_뒤집기_2 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181905

	class Solution {
	    public String solution(String my_string, int s, int e) {
	        StringBuilder sb = new StringBuilder();
	        sb.append(my_string.substring(s,e+1));
	        
	        return my_string.substring(0, s) + sb.reverse() + my_string.substring(e+1);   
	    }
	}
}
