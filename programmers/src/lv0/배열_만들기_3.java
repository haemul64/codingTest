package lv0;
import java.util.*;

public class 배열_만들기_3 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181895

	class Solution {
	    public int[] solution(int[] arr, int[][] intervals) {
	        int from1 = intervals[0][0];
	        int to1 = intervals[0][1];
	        int len1 = to1 - from1 + 1;
	        
	        int from2 = intervals[1][0];
	        int to2 = intervals[1][1];
	        int len2 = to2 - from2 + 1;
	        
	        int len = len1 + len2;
	        
	        int[] ans = new int[len];
	        
	        int idx = from1;
	        for(int i=0; i<len1; i++)
	            ans[i] = arr[idx++];
	        
	        idx = from2;
	        for(int i=len1; i<ans.length; i++)
	            ans[i] = arr[idx++];
	        
	        return ans;
	    }
	}
}
