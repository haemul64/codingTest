package lv0;

public class 가위_바위_보 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120839

	class Solution {
	    public String solution(String rsp) {
	        String answer = "";
	        char target;
	        
	        for(int i=0; i<rsp.length(); i++) {
	            target = rsp.charAt(i);
	            switch(target) {
	                case '0':
	                    answer += '5';
	                    break;
	                case '2':
	                    answer += '0';
	                    break;
	                case '5':
	                    answer += '2';
	                    break;
	            }
	        }
	        
	        return answer;
	    }
	}
}
