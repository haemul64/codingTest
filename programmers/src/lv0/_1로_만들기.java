package lv0;

public class _1로_만들기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181880

	class Solution {
	    public int solution(int[] num_list) {
	        int cnt = 0;
	        
	        for(int i : num_list) {
	            if(i < 2) continue;
	            else if(i < 4) cnt++;
	            else if(i < 8) cnt += 2;
	            else if(i < 16) cnt += 3;
	            else if(i < 32) cnt += 4;
	        }
	        
	        return cnt;
	    }
	}
}
