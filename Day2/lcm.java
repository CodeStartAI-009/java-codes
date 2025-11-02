import java.util.*;
public class lcm{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int lcm=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                lcm=i;
            }
        }
        System.out.println(lcm);
        s.close();
    }
}