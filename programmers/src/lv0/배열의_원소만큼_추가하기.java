package lv0;
import java.util.*;

public class 배열의_원소만큼_추가하기 {
	//https://school.programmers.co.kr/learn/courses/30/lessons/181861

	class Solution {
	    public int[] solution(int[] arr) {
	        List<Integer> li = new ArrayList<>();
	        for(int i=0; i<arr.length; i++){
	            for(int j=0; j<arr[i]; j++){
	                li.add(arr[i]);
	            }
	        }
	        
	        int[] ans = new int[li.size()];
	        for(int i=0; i<li.size(); i++) {
	            ans[i] = li.get(i);
	        }
	        
	        return ans;
	    }
	}
}

// 다른 풀이 
// for(int i=0; i<arr.length; i++) {
//		sum += arr[i]; // arr의 원소의 합 == answer 배열의 크기
// }
// answer = new int[sum];