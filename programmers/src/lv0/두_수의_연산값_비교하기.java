package lv0;

public class 두_수의_연산값_비교하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181938

	class Solution {
	    public int solution(int a, int b) {
	        int ab = Integer.parseInt("" + a + b);
	        
	        if(ab < 2*a*b) return 2*a*b;
	        
	        return ab;
	    }
	}
}
