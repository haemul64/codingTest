package lv0;

public class 홀짝에_따라_다른_값_반환하기 {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/181935

	class Solution {
	    public int solution(int n) {
	        int sum = 0;
	        
	        if(n%2!=0) {
	            for(int i=1; i<=n; i+=2) {
	                sum += i;
	            }
	        } else {
	            for(int i=2; i<=n; i+=2) {
	                sum += i*i;
	            }
	        }
	        
	        return sum;
	    }
	}
}
