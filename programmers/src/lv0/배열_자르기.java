package lv0;

import java.util.Arrays;

public class 배열_자르기 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120833
	}

	class Solution {
		public int[] solution(int[] numbers, int num1, int num2) {
			return Arrays.copyOfRange(numbers, num1, num2+1);
		}
	}
}
