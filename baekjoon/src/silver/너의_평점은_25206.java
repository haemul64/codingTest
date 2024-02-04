package silver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class 너의_평점은_25206 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		int num = 20;
		String subject = "";
		double sum = 0.0;
		double hours = 0.0;
		String[][] table = { { "A+", "4.5" }, { "A0", "4.0" }, { "B+", "3.5" }, { "B0", "3.0" }, { "C+", "2.5" },
				{ "C0", "2.0" }, { "D+", "1.5" }, { "D0", "1.0" }, { "F", "0.0" } };

		while (num-- > 0) {
			subject = sc.next();
			double hour = sc.nextDouble();
			String grade = sc.next();
			if (grade.equals("P"))
				continue;
			for (int i = 0; i < table.length; i++)
				if (grade.equals(table[i][0])) {
					sum += hour * Double.parseDouble(table[i][1]);
					hours += hour;
					break;
				}
		}

		System.out.println(sum / hours);
	} // main
}
