package lv0;

public class 첫_번째로_나오는_음수 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181896
	// +4
	
	class Solution {
	    public int solution(int[] num_list) {
	        int idx = 0;
	        int res = -1;
	        
	        for(int i : num_list) {
	            if(i<0) {
	                res = idx;
	                break;
	            }              
	            idx++;
	        }
	        
	        return res;
	    }
	}
}
