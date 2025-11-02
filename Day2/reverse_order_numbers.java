import java.util.*;
public class reverse_order_numbers{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
        s.close();
    }
}