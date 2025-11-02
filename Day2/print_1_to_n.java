import java.util.*;
public class print_1_to_n{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        s.close();
    }
}