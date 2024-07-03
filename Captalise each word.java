import java.util.*;

/*
        Write a program that capitalizes the first letter of each word in a given string.

        Input:  "hello Good morning everybody"
        Output: "Hello Good Morning Everybody"
 */

class Captalise_each_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strval = sc.nextLine().split(" ");
        for (String word : strval) {
            System.out.print(word.substring(0, 1).toUpperCase());
            System.out.print(word.substring(1) + " ");
        }
    }

}
