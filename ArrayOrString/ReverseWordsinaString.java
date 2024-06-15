import java.util.ArrayList;

class Solution {
    public String reverseWords(String s) {
        ArrayList<String> wordList = new ArrayList<>();

        String temp = "";

        for(char c: s.toCharArray()){
            if(c != ' '){
                temp += c;
            }
            else if(!temp.isEmpty()){
                wordList.add(temp);
                temp = "";
            }
        }

        //Case where we end on a word
        if(!temp.isEmpty()){
            wordList.add(temp);
        }

        String revereString = "";

        for(int i = wordList.size() -1; i >= 0; i --){
            revereString += wordList.get(i);

            if(i != 0){
                revereString += " ";
            }
        }

        return revereString;
    }
}