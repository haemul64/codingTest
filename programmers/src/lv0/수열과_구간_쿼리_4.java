package lv0;

public class 수열과_구간_쿼리_4 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181922
	
	class Solution {
	    public int[] solution(int[] arr, int[][] queries) {
	        int s=0, e=0, k=0;
	        
	        for(int[] query : queries) {
	            s=query[0]; e=query[1]; k=query[2];
	            
	            for(int i=s; i<=e; i++) {
	                if(i%k==0) arr[i]++;
	            }
	        }
	        
	        return arr;
	    }
	}
}
