package lv0;

public class A_강조하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181874
	// +9

	class Solution {
	    public String solution(String myString) {
	        String str = myString.toLowerCase();
	        return str.replaceAll("a", "A");
	    }
	}
}
