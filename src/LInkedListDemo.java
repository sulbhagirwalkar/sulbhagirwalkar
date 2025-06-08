import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LInkedListDemo {
    public static void main(String[] args) {
       /* LinkedList<Integer> linkList = new LinkedList<>();
        linkList.add(3);
        linkList.add(5);
        linkList.add(2);
        linkList.add(3);
        linkList.add(5);

        System.out.println(linkList);
        for(int i=0; i<linkList.size(); i++){
            if(){
            }
        }*/
        int[] array = {1,2,2,3,3,4,4,4,5};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int element : array){
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0)+1);

        }
        System.out.println(frequencyMap);

//if (frequencyMap != ()){

}



    }

