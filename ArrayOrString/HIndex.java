class Solution {
    public int hIndex(int[] citations) {
        int[] citationArray = new int[citations.length +1];
        
        //populate bucket
        for(int count: citations){
            if(count > citations.length){
                citationArray[citations.length] ++;
            }
            else{
                citationArray[count] ++;
            }
        }

        int count = 0;
        for(int i = citationArray.length -1; i >= 0; i--){
            count += citationArray[i];
            if(count >= i){
                return i;
            }
        }

        return 0;

    }
}