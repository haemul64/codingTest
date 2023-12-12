package lv0;

public class 배열의_유사도 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120903
	}
	
	class Solution {
	    public int solution(String[] s1, String[] s2) {
	        int answer = 0;
	        
	        for(String i : s1) {
	            for(String j : s2) {
	                if(i.equals(j)) answer++;
	            }
	        }
	        
	        return answer;
	    }
	}
}
