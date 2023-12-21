package lv0;

public class 특별한_이차원_배열_1 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181833

	class Solution {
	    public int[][] solution(int n) {
	        int[][] answer = new int[n][n];
	        for(int i=0; i<n; i++) {
	            answer[i][i] = 1;
	        }
	        return answer;
	    }
	}
}
