package lv0;

public class 암호_해독 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120892

	class Solution {
	    public String solution(String cipher, int code) {
	        String answer = "";
	        
	        for(int i=0; i<cipher.length(); i++) {
	            if((i+1)%code==0) answer += cipher.charAt(i);
	        }
	        
	        return answer;
	    }
	}
}

// 다른 풀이 (반복 횟수 줄이기)
//class Solution {
//    public String solution(String cipher, int code) {
//        String answer = "";
//
//        for (int i = code; i <= cipher.length(); i = i + code) {
//            answer += cipher.substring(i - 1, i);
//        }
//
//        return answer;
//    }
//}
