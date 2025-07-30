
class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        // A : 64 Z : 90, a : 97 z : 122, 공백 : 32
        for (char ch : s.toCharArray()) {
            if (ch >= 64 && ch <= 90) {
                if (ch + n > 90) {
                    sb.append((char) (ch + n - 26));
                } else {
                    sb.append((char) (ch + n));
                }
            } else if (ch >= 97 && ch <= 122) {
                if (ch + n > 122) {
                    sb.append((char) (ch + n - 26));
                } else {
                    sb.append((char) (ch + n));
                }
            } else {
                // 공백
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}