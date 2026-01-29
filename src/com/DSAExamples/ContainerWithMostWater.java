package com.DSAExamples;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height .length -1;
        int maxWater = 0;

        while(left < right){
            int h = Math.min(height[left], height[right]);
            int width = right -left;
            maxWater = Math.max(maxWater, h * width);
            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
    int []  height = {1,8,6,2,5,4,8,3,7};
    int maxWa = maxArea(height);
        System.out.println(maxWa);
    }
}
