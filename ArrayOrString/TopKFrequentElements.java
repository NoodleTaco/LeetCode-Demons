import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));
        for(Integer key: freqMap.keySet()){
            heap.add(key);
        }
        
        int[] ans = new int[k];

        for(int i = 0; i < k; i ++){
            ans[i] = heap.poll(); 
        }

        return ans;

    
    }
}