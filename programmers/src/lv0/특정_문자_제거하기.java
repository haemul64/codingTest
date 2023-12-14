package lv0;

public class 특정_문자_제거하기 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120826
	}

	class Solution {
	    public String solution(String my_string, String letter) {
	        String answer = "";
	        
	        for(int i=0; i<my_string.length(); i++) {
	            if(my_string.charAt(i)==letter.charAt(0)) continue;
	            else answer += my_string.charAt(i);
	        }
	        
	        return answer;
	    }
	}
}

// 다른 풀이 
// my_string.replace(letter, "");