package recursion;

public class Factorial {
    int fact(int n) {
        if(n == 1) return 1;
        else return n * fact(n - 1);
    }

    static void main() {
        Factorial ob = new Factorial();
        System.out.println(ob.fact(5));
    }
}
