import java.util.Scanner;

/*
        Write a program that counts the number of vowels and consonants in a given string.
        Input:  "Hello World"
        Output: 
            Vowels Count: 3
            Consonants Count: 7
*/

public class vowel_and_consonent_Conunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowelCount = 0, consonantsCount = 0;
        String[] strval = sc.nextLine().split(" ");
        for (String word : strval) {
            for (int iter = 0; iter < word.length(); iter++) {
                char ch = word.charAt(iter);
                if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                        || ch == 'u' || ch == 'U') {
                    vowelCount++;
                } else {
                    if (ch != '!' && ch != ',' && ch != '.' && ch != '?') {
                        consonantsCount++;
                    }
                }
            }
        }
        System.out.println("Vowels Count:" + vowelCount);
        System.out.println("Consonants Count:" + consonantsCount);
    }

}
