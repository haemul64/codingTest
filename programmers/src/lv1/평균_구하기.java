package lv1;

public class 평균_구하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/12944

	class Solution {
	    public double solution(int[] arr) {
	        int sum = 0;
	        double avg = 0.0;
	        
	        for(int i=0; i<arr.length; i++)
	            sum += arr[i];
	        
	        avg = (double) sum / arr.length;
	        
	        return avg;
	    }
	}
}
