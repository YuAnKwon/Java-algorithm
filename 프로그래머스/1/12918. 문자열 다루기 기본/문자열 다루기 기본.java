class Solution {
	public boolean solution(String s) {
		char[] charArr = String.valueOf(s).toCharArray();
		if (charArr.length == 4 || charArr.length == 6) {
			for (char ch : charArr) {
				if (ch >= 65) return false;
			}
			return true;
		}
		return false;

	}
}