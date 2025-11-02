import java.util.*;
public class read_until_negative{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>=0){
            System.out.println(n);
            n=s.nextInt();
        }
        s.close();
    }
}