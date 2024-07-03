import java.util.*;

/*      Write a program that removes all occurrences of a specific character from a String.     
        Input:  "Hello World" and 'o'
        Output: "Hell Wrld"

*/

public class Remove_specific_char {
    public static void main(String arun[]) {
        Scanner sc = new Scanner(System.in);
        String strval = sc.nextLine();
        char ch = sc.next().charAt(0);
        for (int index = 0; index < strval.length(); index++) {
            if (ch != strval.charAt(index)) {
                System.out.print(strval.charAt(index));
            }
        }
    }
}
