import java.util.*;
public class while_even_numbers{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        s.close();
    }
}   