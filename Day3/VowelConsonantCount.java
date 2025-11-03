import java.util.*;
public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int vowels = 0, consonants = 0;
        input = input.toLowerCase();
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
