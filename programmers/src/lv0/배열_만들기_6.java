package lv0;
import java.util.Stack;

public class 배열_만들기_6 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181859

	class Solution {
	    public int[] solution(int[] arr) {
	        
	        Stack<Integer> stk = new Stack<>();
	        
	        for(int i=0; i<arr.length; i++) {
	            if(!stk.empty() && stk.peek()==arr[i])
	                stk.pop();
	            else
	                stk.push(arr[i]);
	        }
	        
	        return stk.empty() ? new int[] {-1} : stk.stream().mapToInt(i->i).toArray();
	    }
	}
}
