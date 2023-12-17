package lv0;

public class 카운트_다운 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181899

	class Solution {
	    public int[] solution(int start_num, int end_num) {
	        int[] answer = new int[start_num - end_num + 1];
	        
	        for(int i=start_num; i>=end_num; i--) {
	            answer[start_num-i] = i;
	        }
	        
	        return answer;
	    }
	}
}
