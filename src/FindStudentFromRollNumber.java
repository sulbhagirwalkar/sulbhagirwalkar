import java.util.HashMap;
import java.util.Map;

public class FindStudentFromRollNumber {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Sulbha");
        students.put(2, "Fanta");
        students.put(3, "Sharukh");

        int rollNumberToCheck = 4;
        if(students.containsKey(rollNumberToCheck)){
            System.out.println("rollNumber is:"+ rollNumberToCheck +
                                "Name: "+ students.get(rollNumberToCheck));
        }else{
            System.out.println("Roll number:" + rollNumberToCheck +"not found");        }
    }


}
