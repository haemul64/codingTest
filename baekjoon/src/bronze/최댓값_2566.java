package bronze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class 최댓값_2566 {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);

		String[][] board = new String[9][9];
		for(int i=0; i<9; i++)
			board[i] = sc.nextLine().split(" ");
		
		int max = 0;
		int row = 1, col = 1;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				int target = Integer.parseInt(board[i][j]);
				if(target > max) {
					row = i + 1;
					col = j + 1;
					max = target;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(row + " " + col);
	} // main
}
