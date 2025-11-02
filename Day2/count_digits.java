import java.util.*;
public class count_digits{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
    
    System.out.println(count);
    s.close();
}
}