package lv0;

import java.util.*;

public class n번째_원소까지 {

	public static void main(String[] args) {
		// https://school.programmers.co.kr/learn/courses/30/lessons/181889

	}

	class Solution {
	    public int[] solution(int[] num_list, int n) {
	        return Arrays.copyOfRange(num_list, 0, n);
	    }
	}
}
