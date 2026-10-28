package hashset;

import java.util.HashSet;

public class HashSetDemo {
    static void main() {
        HashSet<String> fruitNames = new HashSet<>();

        fruitNames.add("Apple");
        fruitNames.add("Orange");
        fruitNames.add("Banana");
        fruitNames.add("Orange");

        System.out.println(fruitNames);
    }
}
