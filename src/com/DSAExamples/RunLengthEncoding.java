package com.DSAExamples;

public class RunLengthEncoding {
    public static String encode(String input){
        if(input == null || input.isEmpty()){
            return input;
            }
        StringBuilder sb = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for(int i = 1; i < input.length(); i++){
            if(input.charAt(i) == currentChar){
                count++;
            }else {
                sb.append(count).append(currentChar);
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        sb.append(count).append(currentChar);
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aabbbccdddaaa";
       /* int count = 1;
        for(int i = 0; i < str.length()-1; i++){
            while(str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append(str.charAt(i));
            sb.append(count);
            System.out.println(str);
        }
    }*/
        System.out.println(encode(str));
    }
}
