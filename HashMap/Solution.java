import java.util.HashSet;

public class Solution {
    public int ArithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int num: nums){
            set.add(num);
        }

        for(int num: set){
            if(set.contains(num - diff) && set.contains(num + diff)){
                count++;
            }
        }

        return count;
    }
}