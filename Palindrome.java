import java.util.Scanner;

/*
     Write a program that checks if a given string is a palindrome.

     Input:  "madam"
     Output: "True"
 */

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strval = sc.next();
        String revstr = "";
        for (int i = strval.length() - 1; i >= 0; i--) {
            revstr = revstr + strval.charAt(i);
        }
        System.out.print(revstr);
        if (revstr.intern() == strval.intern()) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
