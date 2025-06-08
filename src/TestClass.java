import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass {
    public static enum Grade { A, B, C, D};

 private String name;
 private Grade grade;
 public TestClass(String name, Grade grade){
     this.name = name;
     this.grade = grade;
 }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }
    public String toString(){
     return name +":"+grade;
 }
    public static void main(String[] args) {
        List<TestClass> ls = Arrays.asList(new TestClass("s1", Grade.A),new TestClass("s2", Grade.A),new TestClass("s3", Grade.C));

        Map<Grade, List<String>> grouping1 = ls.stream().collect(
                Collectors.groupingBy(TestClass::getGrade,
                        Collectors.mapping(TestClass::getName, Collectors.toList())));
        System.out.println(grouping1);

    }

}
