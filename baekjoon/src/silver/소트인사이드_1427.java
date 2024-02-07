package silver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class 소트인사이드_1427 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		char[] N = sc.next().toCharArray();
		int[] number = new int[10];

		for (int i = 0; i < N.length; i++)
			number[N[i] - '0']++;

		for (int i = number.length - 1; i >= 0; i--)
			while (number[i]-- > 0)
				System.out.print(i);
		System.out.println();
	} // main
}
