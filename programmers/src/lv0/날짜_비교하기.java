package lv0;

public class 날짜_비교하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181838
	// +9
	
	class Solution {
	    public int solution(int[] date1, int[] date2) {
	                
	    for(int i=0; i<date1.length; i++) {
	        if(date1[i] < date2[i])
	            return 1;
	        else if(date1[i] > date2[i])
	            return 0;
	    }        
	        return 0;
	    }
	}
}
