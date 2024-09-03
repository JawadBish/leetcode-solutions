package interviews150.medium;

public class RemoveDuplicates80 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
       int valid = 2;
       for ( int i = 2; i < nums.length; i ++) {
           if ( nums[i] != nums[valid-2]) {
               nums[valid] = nums[i];
               valid++;
           }
       }
        for (int i = 0 ; i < nums.length; i++) {
            System.out.print(nums[i] + " ,");
        }
       return valid;
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2,2, 3};
        System.out.println("response : " + RemoveDuplicates80.removeDuplicates(arr));
    }
}
