package Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
public class CustomMap {

         private HashMap<Integer,String> hashMap;
         private LinkedHashMap<Integer, String> linkedHashMap;
         private TreeMap<Integer, String> treeMap;

        public CustomMap()
        {
            hashMap = new HashMap<>();
            linkedHashMap = new LinkedHashMap<>();
            treeMap = new TreeMap<>();
        }


        // Put (Insert Key-Value Pair)
       public void put(int key, String value)
       {
       hashMap.put(key, value);
       linkedHashMap.put(key, value);
       treeMap.put(key, value);
       printMaps();
       }
       // Remove a key from all maps
       public void remove(int key)
       {
           hashMap.remove(key);
           linkedHashMap.remove(key);
           treeMap.remove(key);
           printMaps();
       }

        // Get value by key
        public String get(int key)
        {
            return hashMap.getOrDefault(key, "Key not found");
        }

        // Check if a key exists
        public boolean containsKey(int key)
        {
            return hashMap.containsKey(key);
        }


        // Get the size of the map
        public int size() {
            return hashMap.size(); // All maps have the same size
        }

        // Advanced Function: putIfAbsent
        public void putIfAbsent(int key, String value) {
            hashMap.putIfAbsent(key, value);
            linkedHashMap.putIfAbsent(key, value);
            treeMap.putIfAbsent(key, value);
            printMaps();
        }

        // Advanced Function: Replace value
       public void replace(int key, String newValue)
       {
           hashMap.replace(key,newValue);
           linkedHashMap.replace(key,newValue);
           treeMap.replace(key, newValue);
           printMaps();
       }

        // Advanced Function: Merge values
       public void merge(int key, String newValue)
       {
           hashMap.merge(key, newValue,(oldVal, newVal)-> oldVal + "," + newVal);
           linkedHashMap.merge(key, newValue,(oldVal, newVal)-> oldVal + ","+ newVal);
           treeMap.merge(key, newValue,(oldVal, newVal)-> oldVal+ "," + newVal);
           printMaps();
       }
        // Print all maps

        public void printMaps()
        {
            System.out.println("HashMap:" + hashMap);
            System.out.println("LinkedHashMap:" + linkedHashMap);
            System.out.println("TreeMap:" + treeMap);
            System.out.println("-------------------------");
        }


    // Main class to test the Custom Map

        public static void main(String[] args) {
            CustomMap customMap = new CustomMap();

            // Inserting elements
            customMap.put(3, "Apple");
            customMap.put(1, "Orange");
            customMap.put(2, "Banana");
            customMap.put(5, "Mango");

            // Checking if a key exists
            System.out.println("Contains key 2? " + customMap.containsKey(2));

            // Removing an element
            customMap.remove(2);

            // Getting a value
            System.out.println("Value of key 3: " + customMap.get(3));

            // Getting map size
            System.out.println("Map size: " + customMap.size());

            // Using putIfAbsent()
            customMap.putIfAbsent(4, "Pineapple");

            // Using replace()
            customMap.replace(1, "Grapes");

            // Using merge()
            customMap.merge(3, "Red Apple");
        }
    }


