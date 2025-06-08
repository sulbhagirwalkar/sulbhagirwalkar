import javax.sound.midi.Soundbank;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Double> treeMap = new TreeMap<>();
        treeMap.put("Sulbha", 100000.00);
        treeMap.put("Seema", 2000.0);
        treeMap.put("Lakshmi", 200000.0);
        treeMap.put("Asha", 100000.0);
        //tree map is sorted map
        for(String name: treeMap.keySet()){
            System.out.println(name.toLowerCase());
        }
       /* Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        for(Map.Entry<String, Double> set1 : set){
            System.out.print(set1.getKey()+ ": ");
            System.out.println(set1.getValue());

        }
      //  System.out.println(treeMap);*/
    }
}
