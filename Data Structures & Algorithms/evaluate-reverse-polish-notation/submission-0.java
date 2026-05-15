class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (!token.equals("+") && !token.equals("-") &&
                !token.equals("*") && !token.equals("/")) {
                stack.push(Integer.parseInt(token));  // ✅ number
            } else {
                int b = stack.pop();  // right operand
                int a = stack.pop();  // left operand

                if (token.equals("+")) stack.push(a + b);
                if (token.equals("-")) stack.push(a - b);
                if (token.equals("*")) stack.push(a * b);
                if (token.equals("/")) stack.push(a / b);
            }
        }
        return stack.pop();
    }
}