package com.DSAExamples;

public class FindIndexOf {
    public static int findIndexOf(String s, String target){
        int index = 0;
        if(s == null || target == null) return -1;

        for(int i = 0; i <= s.length()-target.length(); i++){
            int j = 0;
            while(j < target.length() && s.charAt(i + j) == target.charAt(j)){
                j++;
            }
            if(j == target.length()){
                return i;
            }
        }

        return  -1;
    }
    public static void main(String[] args) {

    }
}
