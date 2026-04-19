package recursion;

public class FindSum {
//  Using recursion, Time: O(n), Space: O(n)
    static int findSum(int n) {
        if(n == 1)
            return 1;

        return n + findSum(n - 1);
    }

//  Time: O(1), Space: O(1)
    static int findSumTwo(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(findSum(5));
        System.out.println(findSumTwo(6));
    }
}
