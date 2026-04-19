package recursion;

public class UniquePath {
//  Time: O(2^(n+m)) because Binary recursion tree, repeated subproblems
//  Space: O(n + m)Max call stack depth

    static int uniquePath(int n, int m) {
        if(n == 1 || m == 1)
            return 1;
        return uniquePath(n - 1, m) + uniquePath(n, m - 1);
    }

    public static void main(String[] args) {
        System.out.println(uniquePath(3 , 3));
    }
}
