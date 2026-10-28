package linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    static void main() {
        LinkedList<String> countryNames = new LinkedList<>();

        countryNames.add("Bangladesh");
        countryNames.add("Germany");
        countryNames.addFirst("Spain");
        countryNames.addLast("Belgium");
        countryNames.add(1, "Switzerland");

        for(String countryName : countryNames) {
            System.out.println(countryName);
        }

        System.out.println(countryNames);
    }
}
