package lv0;

public class 팩토리얼 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120848
	// +3
	
	class Solution {
	    public int solution(int n) {
	        int res = 1;
	        int mul = 1;
	        
	        // 팩토리얼의 결과값 res가 <=n 일때까지
	        // mul을 1부터 1씩 증가시킨다
	        while(res <= n)
	            res *= mul++;
	        
	        // mul을 이미 더했으므로 2를 빼고 리턴
	        return mul-2;
	    }
	}
}
