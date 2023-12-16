package lv0;
import java.util.*;

public class n번째_원소부터 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181892

	class Solution {
	    public int[] solution(int[] num_list, int n) {
	        return Arrays.copyOfRange(num_list, n-1, num_list.length);
	    }
	}
}
