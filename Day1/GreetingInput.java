import java.util.*;
public class GreetingInput{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        System.out.println("Hello,"+name+"! Welcome to the program.");
        s.close();
    }
}