package silver;

import java.io.IOException;
import java.util.Scanner;

public class _2차원_배열의_합_2167 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr = new int[N + 1][M + 1];
		int[][] cumRow = new int[N + 1][M + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				arr[i][j] = sc.nextInt();
				cumRow[i][j] += cumRow[i][j - 1] + arr[i][j];
			}
		}

		int K = sc.nextInt();
		while (K-- > 0) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			int sum = 0;
			for (int idx = i; idx <= x; idx++) {
				sum += cumRow[idx][y];
				sum -= cumRow[idx][j - 1];
			}
			System.out.println(sum);
		}
	} // main
}
