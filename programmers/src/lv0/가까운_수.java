package lv0;

public class 가까운_수 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120890
	// +11

	class Solution {
	    public int solution(int[] array, int n) {
	        int diff = 100;
	        int nearest = 0;
	        
	        for(int i : array) {
	            int tmp = Math.abs(i - n);
	            if(diff > tmp) {
	                diff = tmp;
	                nearest = i;
	            } else if(diff == tmp && nearest > i) {
	                nearest = i;
	            }
	        }
	        
	        return nearest;
	    }
	}
}
