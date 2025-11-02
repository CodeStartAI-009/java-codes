import java.util.*;
public class max_of_three{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b && a>c){
            System.out.println("A is greater than B and C");
        }else if(b>a && b>c){
            System.out.println("B is greater than A and C");
        }else{
            System.out.println("C is greater than A and B");
        }
    
    s.close();
}
}