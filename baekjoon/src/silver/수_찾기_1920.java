package silver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 수_찾기_1920 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] number = new int[N];
		for (int i = 0; i < N; i++)
			number[i] = sc.nextInt();
		Arrays.sort(number);
		int M = sc.nextInt();
		while (M-- > 0) {
			int target = sc.nextInt();
			System.out.println(binarySearch(number, target));
		}
	} // main

	static int binarySearch(int[] number, int target) {
		int l = 0;
		int r = number.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (target > number[m])
				l = m + 1;
			else if (target < number[m])
				r = m - 1;
			else
				return 1;
		}
		return 0;
	}
}
