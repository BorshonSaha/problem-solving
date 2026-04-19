package recursion;

public class JosephusProblem {
//    Time: O(1)
//    Space: O(1)
    
    static int josephusProblem(int n, int k) {
        if(n == 1)
            return 0;
        return (josephusProblem(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        System.out.println(josephusProblem(5, 3));
    }
}
