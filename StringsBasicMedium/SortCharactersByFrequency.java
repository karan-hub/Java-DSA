package StringsBasicMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        SortCharactersByFrequency sorter = new SortCharactersByFrequency();
    String result = sorter.frequencySort("tree");
    System.out.println("Sorted by frequency: " + result);
    }

    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character>[] arr = new ArrayList[s.length() + 1];
        Map<Character, Integer> map = new HashMap<>();

        for (Character character : s.toCharArray())
            map.put(character, map.getOrDefault(character, 0) + 1);

        System.out.println(map.toString());

        map.keySet().forEach(
                c -> {
                    if (arr[map.get(c)] == null)
                        arr[map.get(c)] = new ArrayList<>();
                    arr[map.get(c)].add(c);
                });

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != null) {
                for (Character character : arr[i]) {
                    for (int j = 0; j < i; j++) {
                        sb.append(character);
                    }
                }
            }
        }
        return sb.toString();

    }
}
