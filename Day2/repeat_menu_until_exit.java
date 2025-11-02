import java.util.*;
public class repeat_menu_until_exit{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n!=0){
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
        }
        s.close();
    }
}