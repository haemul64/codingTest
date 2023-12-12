package lv0;

public class 자릿수_더하기 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120906
	}

	class Solution {
	    public int solution(int n) {
	        int sum = 0;
	        
	        while(n!=0) {
	            sum += n%10;
	            n /= 10;
	        }
	        
	        return sum;
	    }
	}
}
