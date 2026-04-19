package recursion;

public class Power {

//    Time complexity: O(b)
//    Each call reduces b by 1, so it makes about b recursive calls.
//    Space complexity: O(b)
//    Because the recursion depth is b, the call stack grows linearly.

    static long power(int a, int b) {
        if(b == 0)
            return 1;
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(3,4));
    }
}
