class Solution {
    public  int solution(int n) {

    	//n을 앞뒤 반전 3진법으로.
    	String nStr = "";
    	while(n >=1) {
    		nStr = nStr + n%3;
    		n = n /3;
    	}
    	
    	// 3진수 ->10진수
    	int answer =0;
    	for(int i=0; i<nStr.length(); i++) {
    		int digit = nStr.charAt(i) - '0'; // ← 문자 → 숫자 변환
    		answer += digit * Math.pow(3,nStr.length()-1-i);
    	}
    	return answer;
    }
}