package interviews150.easy;

public class removeDuplicates26 {

    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[count] != nums[i]) {
                count++;
                nums[count] = nums[i];
            }
            for (int j = count + 1; i < nums.length; i++) {
                nums[j] = -1;
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
