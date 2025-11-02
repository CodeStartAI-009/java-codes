import java.util.*;
public class calculator_if_else{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        String operator=s.next();
        if(operator.equals("+")){
            System.out.println(a+b);
        }else if(operator.equals("-")){
            System.out.println(a-b);
        }else if(operator.equals("*")){
            System.out.println(a*b);
        }else if(operator.equals("/")){
            System.out.println(a/b);
        }else{
            System.out.println("Invalid operator");
        }
        s.close();
    }
}