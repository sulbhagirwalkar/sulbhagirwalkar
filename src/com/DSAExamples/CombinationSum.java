package com.DSAExamples;

import java.util.ArrayList;
import java.util.List;
class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }
    private static void backtrack(int[] candidate, int start, int target, List<Integer> list, List<List<Integer>>result){
        if(start == candidate.length || target < 0) return;
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(candidate[start]);
        backtrack(candidate, start, target - candidate[start], list, result);
        list.remove(list.size() -1);
        backtrack(candidate, start+1, target, list, result);
    }

public static void main(String[] args) {
    int[] candidates = {2,3,6,7};
     int target = 7;
     List<List<Integer>> result = combinationSum(candidates, target);
    System.out.println(result);
    }
}
