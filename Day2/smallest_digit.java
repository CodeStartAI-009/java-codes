import java.util.*;
public class smallest_digit{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int smallest=9;
        while(n>0){
            int digit=n%10;
            if(digit<smallest){
                smallest=digit;
            }
        }
    System.out.println(smallest);
    s.close();
}
}            