/*package DataStructuresAndAlgorithms;



import java.util.Map;
import java.util.Set;

public class HashMap {

    public static void main(String[] args) {

        // This is paramount to CRUD (creating, reading, updating, and deleting).

        // Map< key param, value param> variable name = new HashMap<>;

        // This creates a HashMap through the map interface which allows changing to a different map such as Tree
        // or LinkedHashMap without changing the rest of our code.
        Map<String, String> map = new HashMap<>();
                 // key         value
        map.put("LY2048303", "John Wells");
        map.put("AB0649858", "Lori Wells");
        map.put("AB4453455", "David Windston");
        map.put("CS9857859", "John Smith");
        map.put("LY9475958", "Alen Cornworth");

        System.out.println();

        /*   keySet() method
        for (Object key : keys) {
             Object value = hashMap.get(key);
             System.out.println("ID: " + key + ", NAME: " + value);
         }
         */


        /*  entrySet() method

        Set entries = map.entrySet();
        for (Object entry : entries) {
            Map.Entry mapEntry = (Map.Entry) entry;
            Object key = mapEntry.getKey();
            Object value = mapEntry.getValue();
            System.out.println("ID: " + key + ", NAME: " + value);
        }


        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println("ID: " + key + ", NAME: " + value);
        }
        System.out.println();


    }// end main
} // end class
*/