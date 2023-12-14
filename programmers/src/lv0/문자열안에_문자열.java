package lv0;

public class 문자열안에_문자열 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120908
	}

	class Solution {
	    public int solution(String str1, String str2) {
	        return str1.contains(str2) ? 1 : 2;
	    }
	}
}
