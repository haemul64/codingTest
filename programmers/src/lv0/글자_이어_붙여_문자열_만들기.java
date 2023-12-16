package lv0;

public class 글자_이어_붙여_문자열_만들기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181915
	
	class Solution {
	    public String solution(String my_string, int[] index_list) {
	        String answer = "";
	        
	        for(int i : index_list) {
	            answer += my_string.charAt(i);
	        }
	        
	        return answer;
	    }
	}
}
