package lv0;

public class 이어_붙인_수 {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/181928

	class Solution {
	    public int solution(int[] num_list) {
	        String odd = "";
	        String even = "";
	        
	        for(int num : num_list) {
	            if(num%2==0)
	                even += num;
	            else
	                odd += num;
	        }
	        
	        return Integer.parseInt(odd) + Integer.parseInt(even);
	    }
	}
}
