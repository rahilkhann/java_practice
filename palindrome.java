import java.nio.file.WatchKey;
import java.util.*;

public class palindrome {
    static String checkpalindrome(String word) {
        word = word.toLowerCase();
        String status = null;
        int count = 0;
        if ((word.length() % 2) == 0) {
            for (int i = 0; i < (word.length() / 2); i++) {
                if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                    count++;
                }
            }
        } else if (word.length() % 2 != 0) {
            for (int i = 0; i < ((word.length() - 1) / 2); i++) {
                if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                    count++;
                }
            }
        }
        if (count == (word.length() / 2)) {
            status = "TRUE";
        } else if (count != (word.length() / 2)) {
            status = "FALSE";
        }

        return status;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the word you want to check for palindrome: ");
        String word = scan.next();
        String status = checkpalindrome(word);
        System.out.println(status);        
    }
    
}
