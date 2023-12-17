package lv0;

public class 부분_문자열_이어_붙여_문자열_만들기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181911
	
	class Solution {
	    public String solution(String[] my_strings, int[][] parts) {
	        StringBuilder sb = new StringBuilder();
	        int from = 0;
	        int to = 0;
	        
	        for(int i=0; i<my_strings.length; i++) {
	            from = parts[i][0];
	            to = parts[i][1] + 1;
	            sb.append(my_strings[i].substring(from, to));
	        }
	        
	        return sb.toString();
	    }
	}
}
