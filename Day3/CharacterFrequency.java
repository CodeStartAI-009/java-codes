import java.util.*;
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int[] freq = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("'" + (char)i + "' : " + freq[i]);
            }
        }
    }
}
