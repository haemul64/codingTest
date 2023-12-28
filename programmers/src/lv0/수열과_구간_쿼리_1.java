package lv0;
import java.util.*;

public class 수열과_구간_쿼리_1 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181883
	// +3
	
	class Solution {
	    public int[] solution(int[] arr, int[][] queries) {
	        int[] answer = Arrays.copyOf(arr, arr.length);
	        
	        for(int i=0; i<queries.length; i++){
	            int from = queries[i][0];
	            int to = queries[i][1];
	            
	            for(int j=from; j<=to; j++)
	                answer[j]++;
	        }
	        
	        return answer;
	    }
	}
}
