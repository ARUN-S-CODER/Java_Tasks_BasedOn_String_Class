import java.util.*;

/*
        Write a program that reverses each word in a given string.
        Input:  "Hello World see me"
        Output: "olleH dlroW ees em"
 */

public class Reverse_each_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strval = sc.nextLine().split(" ");
        for (String word : strval) {
            String temp = "";
            for (int index = word.length() - 1; index >= 0; index--) {
                temp += word.charAt(index);
            }
            System.out.print(temp + ' ');
        }
    }
}
