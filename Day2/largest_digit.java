import java.util.*;
public class largest_digit{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int largest=0;
        while(n>0){
            int digit=n%10;
            if(digit>largest){
                largest=digit;
            }
        }
    
    System.out.println(largest);
    s.close();
}
}       