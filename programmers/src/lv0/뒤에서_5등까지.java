package lv0;
import java.util.*;

public class 뒤에서_5등까지 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181853

	class Solution {
	    public int[] solution(int[] num_list) {
	        Arrays.sort(num_list);
	        return Arrays.copyOfRange(num_list, 0, 5);
	    }
	}
}
