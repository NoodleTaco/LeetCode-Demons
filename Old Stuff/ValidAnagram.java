import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> count = new HashMap();

        for (char x : s.toCharArray())
        {
            count.put(s.charAt(x), count.getOrDefault(x, 0) +1);
            
        }

        
        for (char x : t.toCharArray())
        {
            count.put(t.charAt(x), count.getOrDefault(x, 0) -1);
            
        }

        for (int val: count.values())
        {
            if ( val != 0)
            {
                return false;
            }
        }

        return true;
    }
}