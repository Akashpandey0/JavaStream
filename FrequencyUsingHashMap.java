import java.util.*;
public class FrequencyUsingHashMap {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,2,3,4,1,2,1};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num: arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Iterating through for each loop: ");
        freqMap.forEach((key, value) -> {
            System.out.println(key + " --> " + value);
        });

        System.out.println("\nIterating through for loop using entrySet(): ");
        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
