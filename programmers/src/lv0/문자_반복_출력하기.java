package lv0;

public class 문자_반복_출력하기 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120825
	}

	class Solution {
	    public String solution(String my_string, int n) {
	        String repeat = "";
	        
	        for(char ch : my_string.toCharArray()) {
	            for(int i=0; i<n; i++) repeat += ch;
	        }
	        
	        return repeat;
	    }
	}
}

// 다른 풀이 
// StringBuilder sb = new StringBuilder();
// for(char c : my_string.toCharArray())
//		sb.append((c+"").repeat(n));
// return sb.toString();