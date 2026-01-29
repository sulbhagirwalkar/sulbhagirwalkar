import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheFrequencyOfEach {
    public static void main(String[] args) {

        String[] input = {"Rasmalai", "Pedha", "Rasmalai", "Gulabjam", "Rasmalai", "Pedha", "pedha"};


        Map<String, Long> frequencyMap = Arrays.stream(input)
                                                .map(String::toLowerCase)
                                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frequencyMap.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                        .forEach(e -> System.out.println(e.getKey()+ e.getValue()));
        System.out.println(frequencyMap);
    }
}
