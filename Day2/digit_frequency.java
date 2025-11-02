import java.util.*;
public class digit_frequency{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int digit=s.nextInt();
        int frequency=0;
        while(n>0){
            if(n%10==digit){
                frequency++;
            }
        }
        System.out.println(frequency);
        s.close();
    }
}