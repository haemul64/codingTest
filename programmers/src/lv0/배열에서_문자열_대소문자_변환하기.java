package lv0;

public class 배열에서_문자열_대소문자_변환하기 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/181875
	}

	class Solution {
	    public String[] solution(String[] strArr) {
	        String[] answer = new String[strArr.length];
	        
	        for(int i=0; i<answer.length; i++) {
	            if(i%2==0) answer[i] = strArr[i].toLowerCase();
	            else answer[i] = strArr[i].toUpperCase();
	        }
	        
	        return answer;
	    }
	}
}
