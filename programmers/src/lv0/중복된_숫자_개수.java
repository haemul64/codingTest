package lv0;

public class 중복된_숫자_개수 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120583
	}

	class Solution {
	    public int solution(int[] array, int n) {
	        int answer = 0;
	        
	        for(int i : array) {
	            if(i==n) answer++;
	        }
	        
	        return answer;
	    }
	}
}
