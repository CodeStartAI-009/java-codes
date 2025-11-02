import java.util.*;
public class even_odd_check{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    
    s.close();
}
}