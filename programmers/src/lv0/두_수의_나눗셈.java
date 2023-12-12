package lv0;

public class 두_수의_나눗셈 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120806
		// + 4
	}

	class Solution {
	    public int solution(int num1, int num2) {
	        double result = (double) num1 / num2;
	        return (int) (result * 1000);
	    }
	}
}
