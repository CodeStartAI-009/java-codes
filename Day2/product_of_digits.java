import java.util.*;
public class product_of_digits{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int product=1;
        while(n>0){
            product*=n%10;
            n/=10;
        }
    
    System.out.println(product);
    s.close();
}
}