import java.util.Stack;

public class Solution {
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            } else {
                if (stack.peek() == ch) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        if(stack.isEmpty()){
            return 1;
        } else{
            return 0;
        }
    }
}
