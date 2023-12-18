package lv0;
import java.util.*;

public class 배열의_원소_삭제하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/181844

	class Solution {
	    public int[] solution(int[] arr, int[] delete_list) {
	        List<Integer> ansli = new ArrayList<>();
	        Loop1:
	        for(int i=0; i<arr.length; i++) {
	            for(int j=0; j<delete_list.length; j++) {
	                if(arr[i]==delete_list[j]) continue Loop1;
	            }
	            ansli.add(arr[i]);
	        }
	        
	        int[] ans = new int[ansli.size()];
	        for(int i=0; i<ans.length; i++) {
	            ans[i] = ansli.get(i);
	        }
	        
	        return ans;
	    }
	}
}
