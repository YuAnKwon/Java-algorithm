class Solution {
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		char[] charArr = s.toCharArray();

		int length =0;
		int n =0;
		for (int i=0; i<charArr.length; i++) {
			if (charArr[i] == ' ') {
				sb.append(charArr[i]);
				n=0;
			} else {
				if (n % 2 == 0) {
					sb.append(Character.toUpperCase(charArr[i]));
					n++;
				} else {
					sb.append(Character.toLowerCase(charArr[i]));
					n++;
				}
			}
		}

		return sb.toString();
	}
}
