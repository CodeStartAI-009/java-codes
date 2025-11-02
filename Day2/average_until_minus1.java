import java.util.*;
public class average_until_minus1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int count=0;
        while(n!=-1){
            sum+=n;
            count++;
            n=s.nextInt();
        }
    
    System.out.println("Average:"+sum/count);
    s.close();
}
}