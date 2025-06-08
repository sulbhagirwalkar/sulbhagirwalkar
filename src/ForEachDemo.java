import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ForEachDemo {
    public static void main(String[] args) {
        //create an arraylist for integers.

        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(1);
        vals.add(1);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        vals.add(6);
        //use the for each loop to display the elements of arraylist
        int sum = 0;
        Iterator<Integer> values = vals.iterator();
        while(values.hasNext()){
           int i = values.next();
           if(i == values.next()){
               values.remove();
           }
        }
        System.out.println(vals);
    }
}
