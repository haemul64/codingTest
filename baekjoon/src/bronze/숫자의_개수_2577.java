package bronze;

import java.io.IOException;
import java.util.Scanner;

public class 숫자의_개수_2577 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String multi = String.valueOf((long) A * B * C);
		int[] num = new int[10];
		for (char ch : multi.toCharArray())
			num[ch - '0']++;
		for (int i = 0; i < 10; i++)
			System.out.println(num[i]);
	}
}
