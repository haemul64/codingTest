package lv0;

public class 점의_위치_구하기 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120841
		// +3
	}

	class Solution {
	    public int solution(int[] dot) {
	        int quadrant = 0;
	        
	        if(dot[0]*dot[1]>0){ // 제1사분면 또는 제3사분면
	            if(dot[0]>0) quadrant = 1;
	            else quadrant = 3;
	        } else { // 제2사분면 또는 제4사분면
	            if(dot[0]>0) quadrant = 4;
	            else quadrant = 2;
	        }
	        
	        return quadrant;
	    }
	}
}
