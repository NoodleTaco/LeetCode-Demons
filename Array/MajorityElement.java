import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for(int num: nums){
            if(countMap.containsKey(num)){
                countMap.put(num, countMap.get(num) + 1);
            }
            else{
                countMap.put(num, 1);
            }

            if(countMap.get(num) > nums.length /2){
                return num;
            }
        }

        return -1;
    }
}