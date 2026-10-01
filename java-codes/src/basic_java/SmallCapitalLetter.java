package basic_java;

import java.util.Scanner;

public class SmallCapitalLetter {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("" +ch+ " is a small letter");
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println("" +ch+ " is a capital letter");
        } else {
            System.out.println("" +ch+ " is not a letter");
        }
    }
}
