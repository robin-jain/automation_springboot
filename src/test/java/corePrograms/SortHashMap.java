package corePrograms;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMap {
    
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "Apple");
        map.put(2, "Zebra");
        map.put(8, "Banana");
        map.put(1, "Cherry");
        map.put(3, "Date");
        
        System.out.println("Original HashMap:");
        System.out.println(map);
        System.out.println();
        
        // Sort by keys (Integer)
        System.out.println("1. Sorted by Keys (Ascending):");
        sortByKeysAscending(map);
        
        System.out.println("\n2. Sorted by Keys (Descending):");
        sortByKeysDescending(map);
        
        // Sort by values (String)
        System.out.println("\n3. Sorted by Values (Ascending):");
        sortByValuesAscending(map);
        
        System.out.println("\n4. Sorted by Values (Descending):");
        sortByValuesDescending(map);
    }

    // Sort HashMap by Keys in ascending order
    public static void sortByKeysAscending(HashMap<Integer, String> map) {
        map.entrySet().stream()
           .sorted(Map.Entry.comparingByKey())
           .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
    
    // Sort HashMap by Keys in descending order
    public static void sortByKeysDescending(HashMap<Integer, String> map) {
        map.entrySet().stream()
           .sorted(Map.Entry.comparingByKey(Collections.reverseOrder()))
           .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
    
    // Sort HashMap by Values in ascending order
    public static void sortByValuesAscending(HashMap<Integer, String> map) {
        map.entrySet().stream()
           .sorted(Map.Entry.comparingByValue())
           .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
    
    // Sort HashMap by Values in descending order
    public static void sortByValuesDescending(HashMap<Integer, String> map) {
        map.entrySet().stream()
           .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
           .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
    
    // Return sorted HashMap as LinkedHashMap (maintains insertion order)
    public static LinkedHashMap<Integer, String> getSortedHashMapByKeys(HashMap<Integer, String> map) {
        return map.entrySet().stream()
                  .sorted(Map.Entry.comparingByKey())
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1,
                      LinkedHashMap::new
                  ));
    }
}
