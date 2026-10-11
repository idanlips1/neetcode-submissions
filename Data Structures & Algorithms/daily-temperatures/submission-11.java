class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[]result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++){
            int t = temperatures[i];
            while (!stack.isEmpty() && t > stack.peek()[0]){
                int [] pair = stack.pop();
                int stackIndex = pair[1];
                result[stackIndex] = i - stackIndex;
            }
            stack.push(new int[]{t, i});
        }
        return result;
    }
}
