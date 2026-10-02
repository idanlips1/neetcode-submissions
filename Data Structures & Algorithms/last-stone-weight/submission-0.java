class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int weight : stones){
            maxHeap.offer(weight);
        }

        while (maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if (x < y){
                maxHeap.offer(y - x);
            } else if (x > y){
                maxHeap.offer(x - y);
            }
        }
        return !maxHeap.isEmpty() ? maxHeap.peek() : 0;
    }
}
