package hashmap;

import java.util.HashMap;

public class HashMapDemo {
    static void main() {
        HashMap<Integer, String> customers = new HashMap<>();

        customers.put(101, "Borshon");
        customers.put(102, "David");

        System.out.println(customers);
        System.out.println(customers.get(101));
    }
}
