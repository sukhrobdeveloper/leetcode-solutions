package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n: nums) {
            set.add(n);
        }
        return set.size() != nums.length;
    }

    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n: nums) {
            if (set.contains(n))
                return true;
            set.add(n);
        }
        return false;
    }

}
