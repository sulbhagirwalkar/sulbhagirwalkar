import java.util.ArrayList;

public class JavaUtilClassDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sulbha");
        names.add("Shalakha");
        System.out.println(names.get(1));

        StringBuilder sb = new StringBuilder(names.get(1)).reverse();
        System.out.println(sb);
        String str = "sulbhag";
        String str1 = "Smaa";
        String conat = str.concat(str1);
        String result = str.replace("Sma","aaa");
        System.out.println(conat);
        System.out.println(result);

        }
}
