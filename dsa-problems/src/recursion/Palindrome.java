package recursion;

public class Palindrome {

//    Time: O(n) Recurses ~n/2 times, each doing O(1) work
//    Space: O(n) Each recursive call adds a frame to the call stack (~n/2 frames)

    static boolean isPalindrome(String str, int left, int right) {
        if(left >= right)
            return true;
        if(str.charAt(left) != str.charAt(right))
            return false;
        return isPalindrome(str, left + 1, right - 1);
    }

//    Time: O(n) Iterates ~n/2 times with O(1) work per iteration
//    Space: O(1) Only two integer pointers (left, right), no extra memory

    static boolean isPalindromeIterative(String str) {
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar", 0, 6));
        System.out.println(isPalindromeIterative("racecar"));
    }
}
