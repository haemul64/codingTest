package lv0;
import java.util.*;

public class A로_B_만들기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120886
	// +4

	class Solution {
	    public int solution(String before, String after) {
	        
	        char[] b = before.toCharArray();
	        char[] a = after.toCharArray();
	        
	        Arrays.sort(b);
	        Arrays.sort(a);
	        
	        return Arrays.toString(b).equals(Arrays.toString(a)) ? 1 : 0;
	    }
	}
}