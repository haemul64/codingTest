package lv0;

public class 특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181872

	class Solution {
	    public String solution(String myString, String pat) {
	        int idx = myString.lastIndexOf(pat);
	        
	        return myString.substring(0, idx) + pat;
	    }
	}
}
