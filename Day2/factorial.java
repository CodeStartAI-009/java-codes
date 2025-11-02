import java.util.*;
public class factorial{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        System.out.println(factorial);
        s.close();
    }
}