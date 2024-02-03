package silver;

import java.io.IOException;
import java.util.Scanner;

public class 판화_1730 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		char[][] board = new char[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				board[i][j] = (char) 46;

		String orders = "";

		if (sc.hasNext())
			orders = sc.next();

		int r1 = 0, c1 = 0; // 현재 좌표
		int r2 = 0, c2 = 0; // 이동할 좌표

		for (int i = 0; i < orders.length(); i++) {
			char order = orders.charAt(i);
			switch (order) {
			case 'U':
				r2 = r1 - 1;
				c2 = c1;
				break;
			case 'D':
				r2 = r1 + 1;
				c2 = c1;
				break;
			case 'L':
				r2 = r1;
				c2 = c1 - 1;
				break;
			case 'R':
				r2 = r1;
				c2 = c1 + 1;
			}

			if (r2 < 0 || c2 < 0 || r2 >= N || c2 >= N)
				continue;

			draw(board, r1, c1, order);
			draw(board, r2, c2, order);

			r1 = r2;
			c1 = c2;
		}

		for (int i = 0; i < N; i++)
			System.out.println(board[i]);
	} // main

	public static void draw(char[][] board, int r, int c, char order) {
		switch (board[r][c]) {
		case 46:
			if (order == 'U' || order == 'D')
				board[r][c] = 124;
			else
				board[r][c] = 45;
			break;
		case 124:
			if (order == 'L' || order == 'R')
				board[r][c] = 43;
			break;
		case 45:
			if (order == 'U' || order == 'D')
				board[r][c] = 43;
		}
	}
}
