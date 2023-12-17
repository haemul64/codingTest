package lv0;

public class 배열의_길이에_따라_다른_연산하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181854

	class Solution {
	    public int[] solution(int[] arr, int n) {
	        int len = arr.length;
	        
	        if(len%2>0) {
	            for(int i=0; i<len; i+=2)
	                arr[i] += n;
	        } else {
	            for(int i=1; i<len; i+=2)
	                arr[i] += n;
	        }
	        
	        return arr;
	    }
	}
}
