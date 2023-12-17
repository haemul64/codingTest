package lv0;

public class 주사위_게임_1 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181839
	
	class Solution {
	    public int solution(int a, int b) {
	        if(a*b%2>0) return a*a + b*b;
	        else if(a%2==0 && b%2==0) return Math.abs(a-b);
	        else return 2*(a+b);
	    }
	}
}
