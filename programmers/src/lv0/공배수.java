package lv0;

public class 공배수 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/181936
	}

	class Solution {
	    public int solution(int number, int n, int m) {
	        if(number%n==0 && number%m==0) return 1;
	        return 0;
	    }
	}
}
