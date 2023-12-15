package lv0;

public class 원소들의_곱과_합 {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/181929

	class Solution {
	    public int solution(int[] num_list) {
	        int multiply = 1;
	        int sum = 0;
	        
	        for(int num : num_list) { 
	            multiply *= num;
	            sum += num;
	        }
	            
	        return multiply<sum*sum ? 1 : 0;
	    }
	}
}
