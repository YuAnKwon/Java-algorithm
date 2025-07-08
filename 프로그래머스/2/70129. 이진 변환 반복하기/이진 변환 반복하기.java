class Solution {
public static int[] solution(String s) {
		StringBuilder sb = new StringBuilder(s);
		int cnt = 0; // 2진변환의 횟수
		int zeroCnt = 0; // 제거된 0 개수
		while (!sb.toString().equals("1")) {
			// 1.x 의 모든 0을 제거
			for (int i = sb.length()-1; i >=0 ; i--) {
				if (sb.charAt(i) == '0') {
					sb.deleteCharAt(i);
					zeroCnt++;
				}
			}
			
			// 2.x의 길이를 c.
			int c = sb.length();
			// c 2진변환
			String newS = "";
			int rest = 0;
			while (c >0) {
				rest = c % 2;
				newS = rest + newS;
				c = c / 2;
			}
			
			sb.setLength(0);
			sb.append(newS);
			cnt++;
		}
		int[] answer = {cnt,zeroCnt};
		return answer;
	}
}