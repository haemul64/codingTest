package lv0;

public class 수열과_구간_쿼리_2 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181923
	// +2
	
	class Solution {
	    public int[] solution(int[] arr, int[][] queries) {
	        int[] ans = new int[queries.length];
	        int idx = 0;
	        
	        for(int[] query : queries) {
	            int s = query[0];
	            int e = query[1];
	            int k = query[2];
	            int min = 1000001;
	            for(int i=s; i<=e; i++) {
	                if(k<arr[i] && arr[i]<min) min = arr[i];
	            }
	            if(min==1000001) {
	                ans[idx] = -1;
	                idx++;
	                continue;
	            }
	            ans[idx] = min;
	            idx++;
	        }
	        return ans;
	    }
	}
}
