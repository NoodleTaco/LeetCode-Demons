import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occHashMap = new HashMap<>();

        for(int num: arr){
            occHashMap.put(num, occHashMap.getOrDefault(num,0) +1);
        }

        // Return if duplicate values exist in hash table
        HashSet<Integer> hset=new HashSet<>(occHashMap.values());
        return hset.size()==occHashMap.size();
    }
}