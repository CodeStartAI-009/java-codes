import java.util.*;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
