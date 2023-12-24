package lv0;

public class _369게임 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120891

	class Solution {
	    public int solution(int order) {
	        int cnt = 0;
	        String num = String.valueOf(order).replaceAll("(3|6|9)", "-");
	        
	        for(char ch : num.toCharArray())
	            if(ch=='-') cnt++;
	        
	        return cnt;
	    }
	}
}
