package easy;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (Integer num: nums2) {
            if (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        int count = 0;
        for (Integer num: nums1) {
            if (map.containsKey(num)) {
                nums1[count] = map.get(num);
            } else {
                nums1[count] = -1;
            }
            count++;
        }
        return nums1;
    }
}
