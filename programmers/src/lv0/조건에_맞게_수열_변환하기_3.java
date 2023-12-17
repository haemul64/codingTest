package lv0;

public class 조건에_맞게_수열_변환하기_3 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181835

	class Solution {
	    public int[] solution(int[] arr, int k) {
	        
	        if(k%2>0) {
	            for(int i=0; i<arr.length; i++)
	                arr[i] *= k;
	        } else {
	            for(int i=0; i<arr.length; i++)
	                arr[i] += k;
	        }
	        
	        return arr;
	    }
	}
}

// 다른 풀이
// Arrays.stream(arr).map(operand -> k%2==0 ? operand+k : operand*k).toArray();