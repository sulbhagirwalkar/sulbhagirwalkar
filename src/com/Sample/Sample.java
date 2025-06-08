package com.Sample;

import java.util.Stack;

public class Sample {

    public static String isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return "No";
                } else {
                    char pop_val = stack.pop();
                    if (s.charAt(i) == ')' && pop_val != '(') {
                        return "No";
                    } else if (s.charAt(i) == '}' && pop_val != '{') {
                        return "No";
                    } else if (s.charAt(i) == ']' && pop_val != '[') {
                        return "No";
                    }

                }
            }
        }

        if (stack.isEmpty()) {
            return "Yes";

        } else {
            return "Yes";
        }
    }
    public static void main(String[] args) {
        String str = "({}))";
        System.out.println(isValid(str));
     /*  List<String> names = Arrays.asList("Ana", "Bob", "Malisa", "Sam");
       List<String> inUppercase = new ArrayList<>();
       names.stream()
               .map(String::toUpperCase)
               .forEach(name -> inUppercase.add("name"));
        System.out.println(names.size());

        System.out.println(inUppercase.size());

*/
    }
}
