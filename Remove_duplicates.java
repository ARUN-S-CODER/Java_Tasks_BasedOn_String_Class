import java.util.Scanner;

/*
        Write a program that removes duplicate characters from string.

        Input:  "hello"
        Output: "helo"
*/

public class Remove_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strval = sc.next();
        int count = 0;
        for (int i = 0; i < strval.length(); i++) {
            char temp = strval.charAt(i);
            for (int j = 0; j < i + 1; j++) {
                if (strval.charAt(j) == temp) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(temp);
            }
            count = 0;
        }
    }
}
