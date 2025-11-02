import java.util.*;
public class reverse_number{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int reverse=0;
        while(n>0){
            reverse=reverse*10+n%10;
            n/=10;
        }
    
    System.out.println(reverse);
    s.close();
}
}