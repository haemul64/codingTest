package lv0;
import java.util.*;

public class 배열의_길이를_2의_거듭제곱으로_만들기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181857
	// +5

	class Solution {
	    public int[] solution(int[] arr) {
	        
	        int arrLen = arr.length;
	        int power = 1;
	        
	        while(power < arrLen)
	            power *= 2;
	        
	        if(power == arrLen) return arr;
	        
	        return Arrays.copyOf(arr, power);
	    }
	}
}
