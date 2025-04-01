//Demonstrate ArrayList

import java.util.ArrayList;
import java.util.List;

class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> efficiency = new ArrayList<>();
        efficiency.add(4);
        efficiency.add(4);
        efficiency.add(6);
        efficiency.add(7);
        System.out.println(efficiency);
        List<Integer> cost = new ArrayList<>();
        cost.add(1);
        cost.add(1);
        cost.add(2);
        cost.add(2);
        System.out.println(cost);
        int n = efficiency.size();
        int m = cost.size();
        List<Integer> minimumCost = new ArrayList<>();

        for (Integer integer : efficiency) {

            cost.stream().map(item -> integer + item).forEach(minimumCost::add);
        }
        System.out.println(minimumCost);
        }
}

