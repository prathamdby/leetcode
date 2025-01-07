class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mPointer = m - 1;
        int nPointer = n - 1;
        int lastPointer = m + n - 1;

        while (mPointer >= 0 && nPointer >= 0) {
            if (nums1[mPointer] > nums2[nPointer]) {
                nums1[lastPointer] = nums1[mPointer];
                mPointer--;
            } else {
                nums1[lastPointer] = nums2[nPointer];
                nPointer--;
            }

            lastPointer--;
        }

        while (nPointer >= 0) {
            nums1[lastPointer] = nums2[nPointer];
            nPointer--;
            lastPointer--;
        }
    }
}