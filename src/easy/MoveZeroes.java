package easy;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int lastIndexZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastIndexZero++] = nums[i];
            }
        }
        for (int i = lastIndexZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
