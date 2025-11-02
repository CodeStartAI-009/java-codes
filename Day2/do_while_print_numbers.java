import java.util.*;
public class do_while_print_numbers{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
        s.close();
    }
}   