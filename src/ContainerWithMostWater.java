import java.lang.Math;

public class ContainerWithMostWater {
    public static int maxArea(int [] height){
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            int h = Math.min(height[left], height[2]);
            int width = right - left;
            maxWater = Math.max(maxWater, h * width);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {

    }
}
