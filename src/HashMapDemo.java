import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //create a hashmap.

        HashMap<String, Double> hashMap = new HashMap<>();

        // put elements to the map

        hashMap.put("John Do", 3434.34);
        hashMap.put("Tom Smith",123.22);
        hashMap.put("Jane Baker",1378.00);
        hashMap.put("Tod Hall", 99.22);
        hashMap.put("Ralph Smith", -19.08);

        // Get a set of entries.

        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        //Display the set
        for(Map.Entry<String, Double> me : set){
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }
        System.out.println();

        //Deposit 5000 in John doe's account
        hashMap.compute("John Do", (k, balance) -> balance + 5000);
        System.out.println("John DO's new balanace is: " +hashMap.get("John DO") );

        }



}
