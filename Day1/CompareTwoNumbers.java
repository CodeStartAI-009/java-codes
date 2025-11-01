import java.util.*;
public class CompareTwoNumbers{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b){
            System.out.println("A is greater than B");
        }else if(a<b){
            System.out.println("A is less than B");
        }else{
            System.out.println("A is equal to B");
        }
        s.close();
    }
}