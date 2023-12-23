package lv0;
import java.util.*;

public class 약수_구하기 {
	// https://school.programmers.co.kr/learn/courses/30/lessons/120897?language=java
	// +2
	
	class Solution {
	    public int[] solution(int n) {
	        List<Integer> li = new ArrayList<>();
	        
	        for(int i=1; i<=n; i++) {
	            if(n%i==0) li.add(i);
	        }
	        
	        int[] ans = new int[li.size()];
	        
	        for(int i=0; i<ans.length; i++)
	            ans[i] = li.get(i);
	        
	        return ans;
	    }
	}
}

//아이디어
//어차피 n 직전의 약수는 n/2니까, for문을 n/2까지만 체크
//list.stream().mapToInt(e->e).toArray();