package lv0;

public class 조건에_맞게_수열_변환하기_1 {
	
	// https://school.programmers.co.kr/learn/courses/30/lessons/181882
	// +5

	class Solution {
	    public int[] solution(int[] arr) {
	        int[] answer = new int[arr.length];
	        
	        for(int i=0; i<arr.length; i++) {
	            if(arr[i]>=50 && arr[i]%2==0) {
	                answer[i] = arr[i]/2;
	            } else if(arr[i]<50 && arr[i]%2>0) {
	                answer[i] = arr[i]*2;
	            } else {
	                answer[i] = arr[i];
	            }
	        }
	        
	        return answer;
	    }
	}
}
