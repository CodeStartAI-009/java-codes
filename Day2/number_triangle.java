import java.util.*;
public class number_triangle{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    
    s.close();
}
}