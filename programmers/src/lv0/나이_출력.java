package lv0;

public class 나이_출력 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120820
	}
	
	class Solution {
	    public int solution(int age) {
	        int baseAge = 1;
	        int thisYear = 2022;
	        
	        int birthYear = thisYear - age + baseAge;
	            
	        return birthYear;
	    }
	}
}
