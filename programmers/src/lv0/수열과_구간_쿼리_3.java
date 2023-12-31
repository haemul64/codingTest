package lv0;

public class 수열과_구간_쿼리_3 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181924

	class Solution {
	    public int[] solution(int[] arr, int[][] queries) {
	        int tmp = 0;
	        
	        for(int i=0; i<queries.length; i++) {
	            tmp = arr[queries[i][0]];
	            arr[queries[i][0]] = arr[queries[i][1]];
	            arr[queries[i][1]] = tmp;
	        }
	        
	        return arr;
	    }
	}
}
