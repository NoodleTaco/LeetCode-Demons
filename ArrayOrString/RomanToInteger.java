import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
            romanMap.put('I', 1);
            romanMap.put('V', 5);
            romanMap.put('X', 10);
            romanMap.put('L', 50);
            romanMap.put('C', 100);
            romanMap.put('D', 500);
            romanMap.put('M', 1000);
        
        char[] charArray = s.toCharArray();

        int total = 0;

        for(int i = charArray.length -1 ; i >= 0; i--){
            int val = romanMap.get(charArray[i]);
            
            if(i +1 < charArray.length && val < romanMap.get(charArray[i +1])){
                val *= -1;
            }

            total += val;

        }

        return total;

        }
    
}