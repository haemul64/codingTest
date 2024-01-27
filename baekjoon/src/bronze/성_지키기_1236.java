package bronze;

import java.util.Scanner;

public class 성_지키기_1236 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] castle = new char[N][M];
		for (int i = 0; i < N; i++) {
			String line = sc.next();
			for (int j = 0; j < M; j++) {
				castle[i][j] = line.charAt(j);
			}
		}

		char[] row = new char[N];
		char[] column = new char[M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (castle[i][j] == 'X') {
					row[i] = '1';
					column[j] = '1';
				}
			}
		}

		int rowNeed = new String(row).replace("1", "").length();
		int columnNeed = new String(column).replace("1", "").length();

		int guard = Math.max(rowNeed, columnNeed);
		System.out.println(guard);
	}
}
