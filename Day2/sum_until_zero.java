import java.util.*;
public class sum_until_zero{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        while(n!=0){
            sum+=n;
            n=s.nextInt();
        }
        System.out.println(sum);
        s.close();
    }
}