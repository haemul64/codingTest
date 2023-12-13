package lv0;
import java.util.Arrays;

public class 중앙값_구하기 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120811

	}

	class Solution {
	    public int solution(int[] array) {
	        
	        Arrays.sort(array);
	        
	        return array[array.length/2];
	    }
	}
}
