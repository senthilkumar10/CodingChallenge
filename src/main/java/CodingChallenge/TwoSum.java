package CodingChallenge;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int nums[] = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums,target)));


    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> resultMap = new HashMap<Integer,Integer>();
        int result[] = new int[2];

        for(int i=0;i<nums.length;i++){
            if(resultMap.containsKey(target-nums[i])){
                result[0] = resultMap.get(target-nums[i]);
                result[1] = i;
            }else{
                resultMap.put(nums[i],i);
            }

        }

        return result;

    }

}
