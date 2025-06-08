import java.util.List;
//import reactivex.*;

public class Sample {
    public static boolean isEven(int number) {
        System.out.println("is");
        return number % 2 == 0;
    }
    public static int doubleIt(int number){
        System.out.println("isEven called for "+ number);
        return number * 2;
    }
    public static void main(String[] args) {
        /*  List<Integer> numbers = Arrays.asList(1, 2, 3);

        System.out.println(numbers.stream()
                .filter(e-> e % 2 == 0)
                .mapToInt(e -> e * 2)
                .sum());
        Stream<Integer> strm = numbers.stream()
                                      .map(e-> e*2);
        strm.forEach(System.out::println);
                // get the double of sqrt root of the even numbers
        System.out.println(numbers.stream()
                .filter(e -> e % 2 == 0)
                .mapToDouble(e -> (e * e))
                .sum());
        */
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // get the double of sqrt root of even numbers

        //iterative style of writing of code

       /* for(var number : numbers){
            if(number % 2 == 0){
                System.out.println(number * 2);
        }*/
        // declarative approach
        System.out.println(" ------------------- ");
            numbers.stream()
                    .filter(Sample::isEven)
                    .mapToInt(Sample::doubleIt)
                    .limit(1)
                    .forEach(System.out::println);

        System.out.println("------------------");
        //Flowable.fromIterable(numbers);



    }


}
