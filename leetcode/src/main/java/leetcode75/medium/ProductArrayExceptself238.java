package leetcode75.medium;

public class ProductArrayExceptself238 {
    public static int[] productExceptSelf(int[] nums) {

        /*
1,2,3,4
pre : 1,1,2,6
post : 24,12,4,1
        */
      int[] response = new int[nums.length];
      int prefix = 1;
      int postfix =1;
      response[0] = 1;
      for (int i = 1 ; i < nums.length ; i++) {
          response[i] = prefix * nums[i-1];
          prefix = response[i];
      }
        for (int i = nums.length-1 ; i >= 0 ; i--) {
            response[i] = postfix * response[i];
            postfix = nums[i] * postfix;
        }
        return response;
    }

    public static void main(String[] args) {
        int[] jawad = {1,2,3,4};
        int[] res = productExceptSelf(jawad);
       for( int resp : res) {
           System.out.println(resp + ",");
       }
    }
}
