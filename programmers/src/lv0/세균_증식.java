package lv0;

public class 세균_증식 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120910
	}

	class Solution {
	    public int solution(int n, int t) {
	        return n * (int) Math.pow(2, t);
	    }
	}
}

// 다른 풀이 
// return n << t;