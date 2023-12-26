package lv0;

public class 주사위_게임_2 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181930

	class Solution {
	    public int solution(int a, int b, int c) {
	        int res = 0;
	        
	        int sum1 = a + b + c;
	        int sum2 = a*a + b*b + c*c;
	        int sum3 = a*a*a + b*b*b + c*c*c;
	        
	        
	        if(a==b && b==c && c==a) { // a==b && b==c
	            res = sum1 * sum2 * sum3;
	        } else if(a!=b && b!=c && c!=a) {
	            res = sum1;
	        } else {
	            res = sum1 * sum2;
	        }
	        
	        return res;
	    }
	}
}
