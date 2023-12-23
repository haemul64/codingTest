package lv1;

public class 자릿수_더하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/12931

	public class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        while(n!=0) {
	            answer += n%10;
	            n /= 10;
	        }

	        return answer;
	    }
	}
}
