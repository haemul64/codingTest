package lv0;

public class 짝수의_합 {
	
	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120831
	}
	
	class Solution {
	    public int solution(int n) {
	        int sumOfEven = 0;
	        
	        for(int i=2; i<n+1; i+=2) {
	            sumOfEven += i;
	        }
	        
	        return sumOfEven;
	    }
	}
}
