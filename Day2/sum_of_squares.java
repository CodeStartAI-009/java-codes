import java.util.*;
public class sum_of_squares{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i*i;
        }
    
    System.out.println(sum);
    s.close();
}
}