package lv0;

public class 진료_순서_정하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120835
	
	class Solution {
	    public int[] solution(int[] emergency) {
	        int[] order = new int[emergency.length];
	        
	        for(int i=0; i<emergency.length; i++) {
	            order[i] = 1;
	            for(int j=0; j<emergency.length; j++) {
	                if(emergency[j] > emergency[i]) order[i]++;
	            }
	        }
	        
	        return order;
	    }
	}
}
