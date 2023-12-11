package lv0;

public class 각도기 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120829
	}

	class Solution {
	    public int solution(int angle) {
	        int answer = 4;
	        
	        switch(angle/90) {
	            case 0:
	                answer = 1;
	                break;
	            case 1:
	                if(angle==90) {
	                    answer = 2;
	                    break;
	                }
	                else {
	                    answer = 3;
	                    break;
	                }
	        }
	        
	        return answer;
	    }
	}
}
