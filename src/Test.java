import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Person {
    private  String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

/**
 * write a java code to */
public class Test {

    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();

        person.add(new Person("Sulbha", 32));
        person.add(new Person("Jil", 40));
        person.add(new Person("Bob", 34));
        person.add(new Person("Bob", 32));

        Collections.sort(person, Comparator.comparing(Person::getName).reversed()
                .thenComparing(Person::getAge));

       System.out.println(Collections.unmodifiableList(person));
    }
}
