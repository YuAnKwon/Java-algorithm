import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
    	String[] strArr = String.valueOf(s).split("");
    	Arrays.sort(strArr, Collections.reverseOrder());
        String answer = "";
    	for(String str : strArr) {
    		answer += str;
    	}

        return answer;
    }
}