import java.util.*;
public class guess_number_game{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int guess=s.nextInt();
        while(guess!=number){
            System.out.println("Guess the number");
            guess=s.nextInt();
        }
    
    System.out.println("You guessed the number");
    s.close();
}
}