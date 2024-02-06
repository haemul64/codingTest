package silver;

import java.io.IOException;

public class 셀프_넘버_4673 {
	public static void main(String[] args) throws IOException {
		boolean[] numbers = new boolean[10001]; // false면 셀프넘버

		for (int i = 1; i < 10001; i++) {
			int number = makeNumber(i);
			while (number < 10001 && !numbers[number]) {
				numbers[number] = true;
				number = makeNumber(number);
			}
		}

		for (int i = 1; i < 10001; i++) {
			if (!numbers[i])
				System.out.println(i);
		}
	} // main

	public static int makeNumber(int n) {
		int ans = n;
		while (n > 0) {
			ans += n % 10;
			n /= 10;
		}
		return ans;
	}
}
