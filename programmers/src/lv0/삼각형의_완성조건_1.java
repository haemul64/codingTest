package lv0;
import java.util.Arrays;

public class 삼각형의_완성조건_1 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/120889
		// +3
	}

	class Solution {
	    public int solution(int[] sides) {
	        Arrays.sort(sides);
	        return sides[0]+sides[1]>sides[2] ? 1 : 2;
	    }
	}
}
