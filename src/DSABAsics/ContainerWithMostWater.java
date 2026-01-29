package DSABAsics;


public class ContainerWithMostWater {
public static int maxContainer(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;

    while (left < right) {
        int h = Math.min(height[left], height[right]);
        int width = right - left;
        maxArea = Math.max(maxArea, h * width);

        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}

    public static void main(String[] args) {
        int[] height = {1, 3, 6, 9, 5, 6, 8, 7};
        System.out.println(maxContainer(height));
    }
}

