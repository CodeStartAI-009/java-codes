import java.util.*;
public class RemainderCalculator{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int remainder=a%b;
        System.out.println("Remainder:"+remainder);
        s.close();
    }
}