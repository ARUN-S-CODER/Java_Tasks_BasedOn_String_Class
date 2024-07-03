import java.util.Scanner;

/*
        Write a program that counts the number of times a given substring appears in a string.
        Input:  "banana" and "an"
        Output: "The substring count is 2"
*/

public class Count_of_Substring {
    public static void main(String r[]) {
        Scanner sc = new Scanner(System.in);
        String strval = sc.next();
        String substr = sc.next();
        int count = 0;
        for (int iter = 0; iter < strval.length() - substr.length() + 1; iter++) {
            if (strval.substring(iter, iter + substr.length()).intern() == substr.intern()) {
                count++;
            }
        }
        System.out.print("The substring count is " + count);
    }
}
