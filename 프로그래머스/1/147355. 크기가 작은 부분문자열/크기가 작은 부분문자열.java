class Solution {
public  int solution(String t, String p) {
    	int cnt= 0;

    	for(int i=0; i<t.length() - p.length()+1; i++) {
    		String str = t.substring(i, i+p.length());
    		if(Long.parseLong(str) <= Long.parseLong(p)) cnt++;

    	}
    	
    	
        return cnt;
    }
}