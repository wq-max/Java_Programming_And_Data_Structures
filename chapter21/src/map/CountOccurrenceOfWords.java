package map;


import java.util.*;

public class CountOccurrenceOfWords {

    public static void main(String[] args) {
        String text = "Good morning. Have a good class. " +
                "Have a good visit. Have fun!";

        Map<String, Integer> map = new TreeMap<>();

        String[] words = text.split("[\\s+\\p{P}]");
        for (String word : words) {
            String key = word.toLowerCase();
            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }
        map.forEach((k, v) -> System.out.println(k + "\t" + v));

        System.out.println("\n");

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((entry1, entry2) -> {
            return entry1.getValue().compareTo(entry2.getValue());
        });
        for (Map.Entry<String, Integer> entry : entries)
            System.out.println(entry.getKey() + "\t" + entry.getValue());
    }
}
