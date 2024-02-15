package silver;

import java.io.IOException;
import java.util.Scanner;

public class 이상한_술집_13702 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] pots = new int[N];
		for (int i = 0; i < N; i++)
			pots[i] = sc.nextInt();

		long l = 1, r = (1L << 32) - 1, ans = -1;
		while (l <= r) {
			long m = (l + r) / 2;
			int pot = share(pots, m);
			if (pot >= K) {
				ans = m;
				l = m + 1;
			} else
				r = m - 1;
		}

		System.out.println(ans);
	} // main

	static int share(int[] pots, long m) {
		int cntPot = 0;
		for (int pot : pots)
			cntPot += pot / m;
		return cntPot;
	}
} // Main
