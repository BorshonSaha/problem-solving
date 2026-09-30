package binary;

public class MissingNumber {

//  Bruteforce Solution, Time: O(n ^ 2), Space: O(1)
    public int missingNumber(int[] nums) {
        for(int i=0; i<=nums.length; i++) {
            boolean found = false;

            for(int num: nums) {
                if(i == num) {
                    found = true;
                    break;
                }
            }

            if(!found) return i;
        }
        return -1;
    }

//  Elementary Mathematics, Time: O(n), Space: O(1)
    public int missingNumber2(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;

        for(int num : nums) {
            sum -= num;
        }

        return sum;
    }

//  Using XOR operator, Time: O(n), Space: O(1)
    public int missingNumber3(int[] nums) {
        int n = nums.length;
        int xorSum = n;

        for(int i=0; i<n; i++) {
            xorSum ^= i ^ nums[i];
        }

        return xorSum;
    }
}
