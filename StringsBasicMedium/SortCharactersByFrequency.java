package StringsBasicMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        SortCharactersByFrequency sorter = new SortCharactersByFrequency();
        sorter.frequencySort("tree");
    }

    public void frequencySort(String s) {
        List<Character>[] arr =  new ArrayList[s.length()+1];
        Map<Character, Integer> map = new HashMap<>();

    for (Character character : s.toCharArray()) map.put(character, map.getOrDefault(character, 0) + 1);
            
      System.out.println(map.toString());

      map.keySet().forEach(
        c ->{
            if (arr[map.get(c)] == null) arr[map.get(c)] = new ArrayList<>();
            
            arr[map.get(c)].add(c);
        }
      );


    }
}
