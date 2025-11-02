import java.util.*;
public class max_of_two{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b){
            System.out.println("A is greater than B");
        }else{
            System.out.println("B is greater than A");
        }
    
    s.close();
}
}