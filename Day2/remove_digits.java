import java.util.*;
public class remove_digits{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0){
            n=n/10; 
        }
        System.out.println(n);
        s.close();
    }
}