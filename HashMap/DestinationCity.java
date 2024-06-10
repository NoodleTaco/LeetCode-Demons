import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public String destCity(List<List<String>> paths) {

        HashSet<String> startingCitySet = new HashSet<>();

        for(List<String> path: paths){
            startingCitySet.add(path.get(0));
        }

        for(List<String> path: paths){
            if(!startingCitySet.contains(path.get(1))){
                return path.get(1);
            }
        }
        return "";

    }
}