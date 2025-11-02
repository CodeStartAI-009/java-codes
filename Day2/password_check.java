import java.util.*;
public class password_check{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String password=s.nextLine();
        if(password.length()<8){
            System.out.println("Password is too short");
        }
        else if(password.length()>12){
            System.out.println("Password is too long");
        }
        else{
            System.out.println("Password is valid");
        }
    s.close();
}
}