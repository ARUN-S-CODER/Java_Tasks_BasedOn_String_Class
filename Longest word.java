import java.util.*;
/* 
   Write a program that finds the longest word in the given string.
   Input:
        "The quick brown for jumps over the lazy dog"
    Output:
        Longest word: jumps
 */

class Longest_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 0;
        String longword = "";
        String[] strval = sc.nextLine().split(" ");
        for (String word : strval) {
            if (word.length() >= len) {
                len = word.length();
                longword = word;
            }
        }
        System.out.println("Longest word:" + longword);

    }
}
