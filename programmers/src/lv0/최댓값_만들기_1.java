package lv0;
import java.util.Arrays;

public class 최댓값_만들기_1 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120847
	}

	class Solution {
	    public int solution(int[] numbers) {
	        Arrays.sort(numbers);
	        return numbers[numbers.length-1]*numbers[numbers.length-2];
	    }
	}
}
