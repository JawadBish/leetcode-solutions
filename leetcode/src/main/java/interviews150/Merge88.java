package interviews150;

public class Merge88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int all_counter = m+n-1;
        int counter1 = m-1;
        int counter2 = n-1;
        while (counter2 >= 0 ) {
            if( counter1 >= 0 && nums1[counter1] > nums2[counter2]) {
                nums1[all_counter--] = nums1[counter1--];
            } else {
                nums1[all_counter--] = nums1[counter2--];
            }
        }
    }

    public static void main(String[] args) {
    }
}
