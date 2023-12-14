package lv0;

public class 짝수는_싫어요 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120813
	}

	class Solution {
	    public int[] solution(int n) {
	        int size = n%2>0 ? n/2+1 : n/2;
	        int[] odd = new int[size];
	        int idx = 0;
	        
	        for(int i=1; i<=n; i+=2)
	            odd[idx++] = i;
	        
	        return odd;
	    }
	}
}
