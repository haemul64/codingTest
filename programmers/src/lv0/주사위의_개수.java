package lv0;

public class 주사위의_개수 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120845
	
	class Solution {
	    public int solution(int[] box, int n) {
	        int max = 1;
	        
	        for(int i=0; i<box.length; i++){
	            max *= box[i]/n;
	        }
	        
	        return max;
	    }
	}
}
