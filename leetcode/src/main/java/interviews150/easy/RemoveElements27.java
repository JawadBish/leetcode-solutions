package interviews150.easy;

public class RemoveElements27
{
    public static int removeElement(int[] nums, int val) {
        int equalsCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[equalsCount++] = nums[i];
            }
        }
        return equalsCount;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 2, 5};
        int k = 1;
        System.out.println("Answer : " + RemoveElements27.removeElement(nums,k));
    }
}
