package lv0;

public class 배열_뒤집기 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120821
	}

	class Solution {
	    public int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length];
	        
	        for(int i=num_list.length-1; i>=0; i--) {
	            answer[num_list.length-1-i] = num_list[i];
	        }
	        
	        return answer;
	    }
	}
}
