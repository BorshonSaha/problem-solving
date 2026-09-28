// Link: https://leetcode.com/problems/3sum/

package array;

import java.util.*;

public class ThreeSum {

//    Time: O(n ^ 2), Space: O(n)
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) return new ArrayList<>();

        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();

        // Fix the first element(i = 0) and find the other two elements(left and right pointer)
        for(int i=0; i<nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
