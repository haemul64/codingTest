package lv0;

public class 부분_문자열인지_확인하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181843
	
	class Solution {
	    public int solution(String my_string, String target) {
	        return my_string.contains(target) ? 1 : 0;
	    }
	}
}
