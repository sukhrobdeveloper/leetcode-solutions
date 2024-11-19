package medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0; int r = height.length - 1;
        int maxArea = -1;
        while (l < r) {
            int area = Integer.min(height[l], height[r]) * (r - l);
            if (maxArea < area) {
                maxArea = area;
            }

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
