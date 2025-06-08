import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> students = new Hashtable<>();
        students.put("Sulbha", 78);
        students.put("Sam", 89);
        students.put("Adam", 67);
        students.put("Seema", 61);

        // get a set of entries
        Set<Map.Entry<String, Integer>> set = students.entrySet();
        for(Map.Entry<String, Integer> mp: set){
            System.out.print(mp.getKey()+": ");
            System.out.println(mp.getValue());
        }

        // add marks of sulbha

       // Integer marks = students.get("Sulbha");
        students.put("Sulbha", students.get("Sulbha")+20);

        System.out.println("Added marks of Sulbha:");
        System.out.println(students.get("Sulbha"));

       /* System.out.println(students.keySet());
        for(String key: students.keySet()){
            System.out.println(key + " :" + students.get(key));
        }*/
    }
}
