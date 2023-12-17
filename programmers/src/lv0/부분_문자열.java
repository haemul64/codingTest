package lv0;

public class 부분_문자열 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181842

	class Solution {
	    public int solution(String str1, String str2) {
	        return str2.contains(str1) ? 1 : 0;
	    }
	}
}
