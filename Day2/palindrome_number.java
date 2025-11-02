import java.util.*;
public class palindrome_number{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int reverse=0;
        while(n>0){
            reverse=reverse*10+n%10;
            n/=10;
        }
    System.out.println(reverse);
    if(reverse==n){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not Palindrome");
    }
    s.close();
}
}