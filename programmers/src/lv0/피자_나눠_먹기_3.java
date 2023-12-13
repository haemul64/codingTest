package lv0;

public class 피자_나눠_먹기_3 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120816
	}

	class Solution {
	    public int solution(int slice, int n) {
	        int answer = 1;
	        
	        if(slice<n) {
	            answer = n%slice==0 ? n/slice : n/slice+1;
	        }
	        
	        return answer;
	    }
	}
}
