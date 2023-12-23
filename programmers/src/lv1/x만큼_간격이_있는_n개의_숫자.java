package lv1;

public class x만큼_간격이_있는_n개의_숫자 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/12954
	// +5
	
	class Solution {
	    public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        long multi = x;
	        
	        for(int i=0; i<answer.length; i++)
	            answer[i] = (long) multi*(i+1);
	        
	        return answer;
	    }
	}
}
