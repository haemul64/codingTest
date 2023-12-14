package lv0;

public class 숨어있는_숫자의_덧셈_1 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120851
	}

	class Solution {
	    public int solution(String my_string) {
	        int answer = 0;
	        
	        char[] ch = my_string.toCharArray();
	        for(char c : ch) {
	            if('0'<=c && c<='9') answer += (c-'0');
	        }
	        
	        return answer;
	    }
	}
}

// 다른 풀이 
// String str = my_string.replaceAll("[^0-9]", "");