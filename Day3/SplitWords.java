import java.util.*;

public class SplitWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        // Split the input string into words
        String[] words = input.trim().split("\\s+");

        // Print each word on a new line
        for (String word : words) {
            System.out.println(word);
        }
    }
}
