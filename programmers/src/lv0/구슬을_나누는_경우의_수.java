package lv0;

public class 구슬을_나누는_경우의_수 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120840
	// +6

	class Solution {
		public int solution(int balls, int share) {

			if (balls - share < share)
				share = balls - share;

			double permutation = permutation(balls, share);
			double divider = factorial(share);

			return (int) (permutation / divider);
		}
	}

	static public double permutation(int n, int r) {
		double result = 1;

		for (int i = n; i >= n - r + 1; i--)
			result *= i;

		return result;
	}

	static public double factorial(int r) {
		if (r == 1)
			return 1;

		double result = 1;

		for (int i = r; i >= 1; i--)
			result *= i;

		return result;
	}
}
