import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        //Demonstrate various optional methods
        Optional<String> firstName = Optional.empty();
        Optional<String> lastName = Optional.of("Sulbha");

        if(firstName.isPresent()){
            System.out.println("firstName is not present will not print");
        }else{
            System.out.println("firstName is not present");
        }
        if(lastName.isPresent()) System.out.println("last name is present" + lastName.get());
    }

}


