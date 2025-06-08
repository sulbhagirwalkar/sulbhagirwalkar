import java.util.TreeSet;

// use the custom comparator
// reverse comparator for string
/**
 * class MyComparator implements Comparator<String>{

 public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
 instead of this we can make use of String::compareTo*/
public class CompDemo {
    public static void main(String[] args) {
TreeSet<String> lastName = new TreeSet<>(String::compareTo);

        lastName.add("B");
        lastName.add("A");
        lastName.add("D");
        lastName.add("C");
        for(String name: lastName){
            System.out.print(name + " ");
        }
    }
}