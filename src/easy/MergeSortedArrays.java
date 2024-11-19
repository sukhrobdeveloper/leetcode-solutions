package easy;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        int[] tempArr = nums1;
        nums1 = new int[last + 1];
        while (m > 0 && n > 0) {
            if (tempArr[m - 1] > nums2[n - 1]) {
                nums1[last] = nums1[m - 1];
                m--;
            } else {
                nums1[last] = nums2[n - 1];
                n--;
            }
            last--;
        }
        while (n > 0){
            nums1[last] = tempArr[n - 1];
            n--; last--;
        }

    }
}
