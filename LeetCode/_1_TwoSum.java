package LeetCode;

import java.util.Arrays;

public class _1_TwoSum {

    public static void main(String[] args) {

        _1_TwoSum.twoSum( new int[]{2,7,11,15}, 9);
        _1_TwoSum.twoSum( new int[]{3,2,4}, 6);
        _1_TwoSum.twoSum( new int[]{3,3}, 6);
        _1_TwoSum.twoSum( new int[]{-1,-2,-3,-4,-5}, -8); //[2, 4]
        _1_TwoSum.twoSum( new int[]{2,5,5,11}, 10);
        _1_TwoSum.twoSum( new int[]{3,2,4}, 6);


    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result =  new int[2];
        outer:
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]== target){
                    result = new int[]{i, j};
                    break outer;
                }
            }
        }
        System.out.println(Arrays.toString(result));
        return  result;
    }
}
