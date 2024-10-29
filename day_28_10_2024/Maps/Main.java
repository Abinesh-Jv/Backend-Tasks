package Maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Theater1", "Downtown");
        hashMap.put("Theater2", "Midtown");
        hashMap.put("Theater3", "Uptown");
        hashMap.put(null, "Central Park");
        hashMap.put("Theater4", null);
        System.out.println("HashMap :");
        System.out.println(hashMap); //no order maintained

        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("Theater1", "Downtown");
        hashTable.put("Theater2", "Midtown");
        hashTable.put("Theater3", "Uptown");
        System.out.println("\nHashtable :");
        System.out.println(hashTable); //no null keys or values and no order maintained

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Theater1", "Downtown");
        linkedHashMap.put("Theater2", "Midtown");
        linkedHashMap.put("Theater3", "Uptown");
        linkedHashMap.put(null, "Central Park");
        linkedHashMap.put("Theater4", null);
        System.out.println("\nLinkedHashMap :");
        System.out.println(linkedHashMap); //insertion order maintained
    }
}
