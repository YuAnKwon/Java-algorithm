class Solution {
    public int[] solution(String s) {
        int[] intArr = new int[s.length()];
        char[] charArr = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            int index = s.lastIndexOf(charArr[i], i-1);
            System.out.println(index);
            if(index == -1){
                intArr[i] = -1;
                System.out.println(intArr[i]);
            } else {
                intArr[i] = i - index;
                System.out.println(intArr[i]);
            }
            System.out.println("-----");
        }

        return intArr;
    }
}
