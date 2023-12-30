package lv0;

public class _2차원으로_만들기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120842

	class Solution {
	    public int[][] solution(int[] num_list, int n) {
	        int len = num_list.length;
	        int[][] ans = new int[len/n][n];
	        int idx = 0;
	        
	        for(int i=0; i<len/n; i++) {
	            for(int j=0; j<n; j++)
	                ans[i][j] = num_list[idx++];
	        }
	        
	        return ans;
	    }
	}
}
