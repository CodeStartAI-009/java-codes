import java.util.*;
public class triangle_validity{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a+b>c&&b+c>a&&c+a>b){
            System.out.println("Triangle is valid");
        }
    
    s.close();
}
}