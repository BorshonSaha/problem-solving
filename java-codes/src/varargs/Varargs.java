package varargs;

public class Varargs {

    void add(int ...nums){
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }

        System.out.println(sum);
    }

    static void main() {
        Varargs ob = new Varargs();
        ob.add(10, 20);
        ob.add(10, 20, 30, 40, 50);
    }
}
