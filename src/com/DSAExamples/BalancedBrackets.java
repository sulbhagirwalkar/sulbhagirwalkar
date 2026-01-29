package com.DSAExamples;

import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String s){

        Stack<Character> stack = new Stack<>();
        for( char ch : s.toCharArray()){

            if(ch == '(' || ch =='{' || ch =='['){
                stack.push(ch);
            }else if(ch == ')' || ch =='}' || ch ==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(!isMatchingPair(top, ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    private static boolean isMatchingPair(char open, char close){
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}')||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String inputStr ="{}({[]})";
        boolean result = isBalanced(inputStr);
        System.out.println(result);
    }
}
