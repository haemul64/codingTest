package silver;

import java.util.Scanner;

public class 줄세우기_10431 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int[][] cases = new int[p][21];
		for (int i = 0; i < p; i++)
			for (int j = 0; j < 21; j++)
				cases[i][j] = sc.nextInt();

		for (int i = 0; i < p; i++) {
			int totalMove = 0;
			for (int j = 20; j > 0; j--) {
				int student = cases[i][j];
				int move = 0;
				for (int k = j - 1; k > 0; k--)
					if (cases[i][k] >= student)
						move++;
				totalMove += move;
			}
			System.out.println(cases[i][0] + " " + totalMove);
		}
	}
}
