package silver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 문자열_집합_14425 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		// N개의 문자열로 이루어진 집합 S가 주어질 때,
		// 다음으로 주어지는 M개의 문자열 중 집합 S에 속하는 문자열이 몇 개인지 카운트
		int N = sc.nextInt();
		int M = sc.nextInt();
		String[] set = new String[N];
		for (int i = 0; i < N; i++)
			set[i] = sc.next();
		Arrays.sort(set);
		int cnt = 0;
		while (M-- > 0)
			cnt += Arrays.binarySearch(set, sc.next()) >= 0 ? 1 : 0;
		System.out.println(cnt);
	} // main
}

class Solution2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		// N개의 문자열로 이루어진 집합 S가 주어질 때,
		// 다음으로 주어지는 M개의 문자열 중 집합 S에 속하는 문자열이 몇 개인지 카운트
		int N = sc.nextInt();
		int M = sc.nextInt();
		String[] set = new String[N];
		for (int i = 0; i < N; i++)
			set[i] = sc.next();
		Arrays.sort(set);
		int cnt = 0;
		while (M-- > 0)
			cnt += binarySearch(set, sc.next());
		System.out.println(cnt);
	} // main

	static int binarySearch(String[] set, String test) {
		int l = 0;
		int r = set.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (set[m].compareTo(test) > 0)
				r = m - 1;
			else if (set[m].compareTo(test) < 0)
				l = m + 1;
			else
				return 1;
		}
		return 0;
	}
}