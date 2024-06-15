class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPtr = 0;
        int tPtr = 0;

        while(tPtr < t.length() && sPtr < s.length()){
            if(t.charAt(tPtr) == s.charAt(sPtr)){
                sPtr++;
            }

            tPtr ++;
        }

        return s.length() == sPtr;


    }
}