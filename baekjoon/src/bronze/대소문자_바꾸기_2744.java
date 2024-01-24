package bronze;

import java.io.FileInputStream;
import java.util.Scanner;

public class 대소문자_바꾸기_2744 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		char[] str = sc.next().toCharArray();
		
		for(int i=0; i<str.length; i++) {
			if('a' <= str[i] && str[i] <= 'z') {
				str[i] = (char)(str[i] - 'a' + 'A');
			} else {
				str[i] = (char)(str[i] - 'A' + 'a');
			}
		}
		
		System.out.println(str);
	}
}
