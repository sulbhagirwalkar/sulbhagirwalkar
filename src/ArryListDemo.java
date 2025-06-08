//Demonstrate ArrayList

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Employee{
    int id;
    String lastName;

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Employee(int id, String lastName) {
        this.id = id;
        this.lastName = lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

class ArrayListDemo {
    public static void main(String[] args) {
        List<Employee> efficiency = new ArrayList<>();
        efficiency.add(new Employee(1, "sulbha"));
        efficiency.add(new Employee(2, "Adam"));
        efficiency.add(new Employee(3, "Emily"));
        System.out.println(efficiency);
    }

}

