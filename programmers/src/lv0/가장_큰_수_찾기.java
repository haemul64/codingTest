package lv0;

public class 가장_큰_수_찾기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120899

	class Solution {
	    public int[] solution(int[] array) {
	        int[] ans = new int[2];
	        
	        for(int i=0; i<array.length; i++) {
	            if(array[i]>ans[0]) {
	                ans[0] = array[i];
	                ans[1] = i;
	            }
	        }
	        
	        return ans;
	    }
	}
}
