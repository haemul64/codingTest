package lv0;

public class 분수의_덧셈 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120808
	// +2
	
	class Solution {
	    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
	        
	        int numer = numer1 * denom2 + numer2 * denom1;
	        int denom = denom1 * denom2;
	        
	        int gcd = gcd(numer, denom);
	        
	        return new int[]{numer/gcd, denom/gcd};
	    }	    
	}
	
	static int gcd(int a, int b) { // 최대 공약수 구하기
		if(a<b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		while(b!=0) { // 유클리드 호제법
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}
