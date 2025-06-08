//Demonstrate Iterator

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //create an arrayList
        ArrayList<String> a1 = new ArrayList<>();

        //add elements to the arraylist
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");

        //use iterator to display contents of a1
        System.out.println("original content of arraylist a1 is: ");
        Iterator<String> itr = a1.iterator();
        while(itr.hasNext()){
            String elements = itr.next();
            System.out.print(elements + " ");
        }
        System.out.println();

        //Modify the objects being iterated
        ListIterator<String> litr = a1.listIterator();

        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }
           System.out.print("Modified content of a1: ");
           itr = a1.iterator();
           while (itr.hasNext()){
               String element = itr.next();
               System.out.print(element);
           }
        System.out.println();
           // now display the list backward

        System.out.println("Modified List in the backward: ");
        while (litr.hasPrevious()){
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
        }

    }

