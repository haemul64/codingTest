package lv0;

public class 가까운_1_찾기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181898
	// +5
	
	class Solution {
	    public int solution(int[] arr, int idx) {
	        int answer = -1;
	        for(int i=idx; i<arr.length; i++) {
	            if(arr[i]==1) return i;
	        }
	        return answer;
	    }
	}
}
