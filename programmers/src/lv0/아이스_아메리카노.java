package lv0;

public class 아이스_아메리카노 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120819
	}

	class Solution {
	    public int[] solution(int money) {
	        int[] answer = {money/5500, money%5500};
	        return answer;
	    }
	}
}
