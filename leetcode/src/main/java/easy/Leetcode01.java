package easy;

import java.util.Arrays;

public class Leetcode01 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i+1; j < nums.length; j++ )  {
                int otherIntToFind = target - nums[i];
                if ( otherIntToFind == nums[j] ) return new int[] { i , j};
            }
        }
        throw new IllegalArgumentException("not match");
    }


    public static void main(String[] args) {
        int[] sol = new int[]{2,3,11,7,15};
        System.out.println(Arrays.toString(twoSum(sol,9 )));
    }
}