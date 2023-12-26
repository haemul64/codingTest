package lv0;

public class 옹알이_1 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120956
	// +3

	class Solution {
	    public int solution(String[] babbling) {
	        int sayable = 0;
	        
	        for(int i=0; i<babbling.length; i++) {
	            babbling[i] = babbling[i].replaceAll("(aya|ye|woo|ma)", "");
	            if(babbling[i].isBlank()) sayable++;
	        }
	        
	        return sayable;
	    }
	}
}
