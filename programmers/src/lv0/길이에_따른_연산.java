package lv0;

public class 길이에_따른_연산 {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/181879

	class Solution {
	    public int solution(int[] num_list) {
	        int answer = 0;
	        
	        if(num_list.length>10) {
	            for(int i=0; i<num_list.length; i++)
	                answer += num_list[i];
	        } else {
	            answer = 1;
	            for(int i=0; i<num_list.length; i++)
	                answer *= num_list[i];
	        }
	        
	        return answer;
	    }
	}
}

// int answer = (num_list.length < 11 ? 1 : 0); 