class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++){
            int t = temperatures[i];
            // While the stack is not empty and the current temperature is warmer than the top of the stack
            while (!stack.isEmpty() && t > stack.peek()[0]){
                int[] pair = stack.pop();
                int stackT = pair[0];
                int stackInd = pair[1];
                res[stackInd] = i - stackInd;
            }
            stack.push(new int[]{t, i});
        }
        return res;
    }
}
