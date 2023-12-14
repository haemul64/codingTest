package lv0;

public class flag에_따라_다른_값_반환하기 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/181933
	}

	class Solution {
	    public int solution(int a, int b, boolean flag) {
	        return flag ? a+b : a-b;
	    }
	}
}
