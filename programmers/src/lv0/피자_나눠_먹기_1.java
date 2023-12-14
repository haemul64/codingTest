package lv0;

public class 피자_나눠_먹기_1 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120814
		// +3
	}

	class Solution {
	    public int solution(int n) {
	        if(n<=7) return 1; // 생략 가능
	        else return n%7>0 ? n/7+1 : n/7;
	    }
	}
}
