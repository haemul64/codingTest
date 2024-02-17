package bronze;

import java.io.IOException;
import java.util.Scanner;

public class 나머지_3052 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		boolean[] chkNum = new boolean[42];
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt() % 42;
			if (!chkNum[num]) {
				cnt++;
				chkNum[num] = true;
			}
		}
		System.out.println(cnt);
	} // main
}
