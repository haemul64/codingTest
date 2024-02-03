package bronze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class 음계_2920 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		// 아래부터 풀이 작성
		int[] play = new int[8];
		int ascending = 0;
		int descending = 0;

		for (int i = 0; i < 8; i++)
			play[i] = sc.nextInt();

		for (int i = 1; i < 8; i++) {
			if (play[i] > play[i - 1])
				ascending++;
			else if (play[i] < play[i - 1])
				descending++;
		}

		if (ascending == 7)
			System.out.println("ascending");
		else if (descending == 7)
			System.out.println("descending");
		else
			System.out.println("mixed");
	} // main
}
