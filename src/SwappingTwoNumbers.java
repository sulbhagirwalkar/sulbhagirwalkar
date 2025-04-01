import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SwappingTwoNumbers {
   /* public static List<String> returnUniqueWords(List<String> inputSentence){
    List<String> result = new ArrayList<>();
*/
   public static void main(String[] args) {
       String str = "Java is fun and Java is Powerful";
       System.out.println(str);
       List<String> uniqueWords = Arrays.stream(str.split(" ")).map(String::toLowerCase).distinct().sorted().collect(Collectors.toList());
       System.out.println(uniqueWords);
   }

}
