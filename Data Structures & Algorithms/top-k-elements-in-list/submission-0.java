class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
         Map<Integer,Integer> map = new HashMap<>();
         for(int num :nums){
            map.put(num,map.getOrDefault(num, 0) +1 );
             }
             Queue<Integer> minHeap= new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
             for(int key:map.keySet())
             { 
                minHeap.add(key);
                if(minHeap.size()>k)
                { minHeap.poll();
                }

             }
             while(k-->0)
             {
                res[k]=minHeap.poll();

             }
             return res;
                 }
}
