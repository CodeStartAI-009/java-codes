import java.util.*;
public class menu_calculator{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        while(n!=0){
            System.out.println("Menu");
            System.out.println("1. Add"+(a+b));
            System.out.println("2. Subtract"+(a-b));
            System.out.println("3. Multiply"+(a*b));
            System.out.println("4. Divide"+(a/b));
        }
    
    s.close();
}
}