package lv0;

public class 원하는_문자열_찾기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181878
	// +3

	class Solution {
	    public int solution(String myString, String pat) {
	        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
	    }
	}
}
