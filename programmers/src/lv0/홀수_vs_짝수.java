package lv0;

public class 홀수_vs_짝수 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181887

	class Solution {
	    public int solution(int[] num_list) {
	        int odd = 0; // 홀수 번째 원소들의 합
	        int even = 0; // 짝수 번째 원소들의 합
	        
	        for(int i=0; i<num_list.length; i++) {
	            if(i%2==0) odd += num_list[i];
	            else even += num_list[i];
	        }
	        
	        return odd>even ? odd : even;
	    }
	}
}
