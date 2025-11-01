import java.util.*;
public class AgeFromBirthYear{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int birthYear=s.nextInt();
        int age=2025-birthYear;
        System.out.println("Age:"+age);
        s.close();
    }
}